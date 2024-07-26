package mv.local.api.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import mv.local.api.model.CarBrand
import mv.local.api.model.ImgCarResponse
import io.swagger.v3.oas.annotations.media.Schema

/**
 * 
 * @param id 
 * @param owner 
 * @param brand 
 * @param carMileage 
 * @param carYear 
 * @param cost 
 * @param images 
 * @param carCondition 
 * @param carEngine 
 * @param description 
 * @param transmission 
 */
data class CarCardsResponse(

    @Schema(example = "null", description = "")
    @get:JsonProperty("id") var id: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("owner") var owner: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("brand") var brand: CarBrand? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("car_mileage") var carMileage: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("car_year") var carYear: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("cost") var cost: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("images") var images: kotlin.collections.MutableList<ImgCarResponse>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("car_condition") var carCondition: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("car_engine") var carEngine: kotlin.Double? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("description") var description: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("transmission") var transmission: kotlin.String? = null
) {

}

