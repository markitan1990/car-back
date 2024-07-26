package mv.local.repository

 import mv.local.api.model.CarBrand
 import mv.local.api.model.CarCardsResponse
 import mv.local.api.model.ImgCarResponse
import mv.local.tables.daos.CarCardsDao
 import mv.local.tables.references.BRAND
 import mv.local.tables.references.CAR_CARDS
import mv.local.tables.references.CAR_IMAGES
import org.jooq.Configuration
import org.jooq.DSLContext
import org.springframework.stereotype.Repository

@Repository
class CarRepository(
    private val dsl: DSLContext,
    configuration: Configuration
) : CarCardsDao(configuration) {


    fun getImages(id: Long): MutableList<ImgCarResponse> = dsl
        .selectFrom(CAR_IMAGES)
        .where(CAR_IMAGES.CAR_CARDS_ID.eq(id))
        .fetch { record ->
            val img = record.into(CAR_IMAGES)
            ImgCarResponse(
                img.carCardsId,
                img.link
            )
        }

    fun getCarsWithImages(): List<CarCardsResponse> {
        val carsMap = mutableMapOf<Long, CarCardsResponse>()

        dsl.select(
            CAR_CARDS.ID,
            CAR_CARDS.OWNER,
            CAR_CARDS.CAR_MILEAGE,
            CAR_CARDS.CAR_YEAR,
            CAR_CARDS.COST,
            CAR_CARDS.CAR_CONDITION,
            CAR_CARDS.CAR_ENGINE,
            CAR_CARDS.DESCRIPTION,
            CAR_CARDS.TRANSMISSION,
            BRAND.CAR_CARDS_ID,
            BRAND.CAR_NAME,
            BRAND.LINK,
            CAR_IMAGES.CAR_CARDS_ID,
            CAR_IMAGES.LINK
        )
            .from(CAR_CARDS)
            .leftJoin(BRAND).on(CAR_CARDS.ID.eq(BRAND.CAR_CARDS_ID))
            .leftJoin(CAR_IMAGES).on(CAR_CARDS.ID.eq(CAR_IMAGES.CAR_CARDS_ID))
            .fetch { record ->
                val carId = record.get(CAR_CARDS.ID)
                val car = carsMap.computeIfAbsent(carId!!) {
                    CarCardsResponse(
                        id = carId,
                        owner = record.get(CAR_CARDS.OWNER),
                        carMileage = record.get(CAR_CARDS.CAR_MILEAGE),
                        carYear = record.get(CAR_CARDS.CAR_YEAR),
                        cost = record.get(CAR_CARDS.COST),
                        carCondition = record.get(CAR_CARDS.CAR_CONDITION),
                        carEngine = record.get(CAR_CARDS.CAR_ENGINE),
                        description = record.get(CAR_CARDS.DESCRIPTION),
                        transmission = record.get(CAR_CARDS.TRANSMISSION),
                        brand = CarBrand(
                            carCardsId = record.get(BRAND.CAR_CARDS_ID),
                            carName = record.get(BRAND.CAR_NAME),
                            link = record.get(BRAND.LINK)
                        ),
                        images = mutableListOf()
                    )
                }

                record.get(CAR_IMAGES.LINK)?.let { link ->
                    car.images?.add(ImgCarResponse(carCardsId = carId, link = link))
                }
            }

        return carsMap.values.toList()
    }


}