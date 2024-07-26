/*
 * This file is generated by jOOQ.
 */
package mv.local.tables.records


import mv.local.tables.CarCards

import org.jooq.Field
import org.jooq.Record1
import org.jooq.Record7
import org.jooq.Row7
import org.jooq.impl.UpdatableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class CarCardsRecord() : UpdatableRecordImpl<CarCardsRecord>(CarCards.CAR_CARDS), Record7<Long?, String?, String?, Int?, Int?, Int?, Int?> {

    open var id: Long?
        set(value): Unit = set(0, value)
        get(): Long? = get(0) as Long?

    open var owner: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    open var brand: String?
        set(value): Unit = set(2, value)
        get(): String? = get(2) as String?

    open var carMileage: Int?
        set(value): Unit = set(3, value)
        get(): Int? = get(3) as Int?

    open var carYear: Int?
        set(value): Unit = set(4, value)
        get(): Int? = get(4) as Int?

    open var cost: Int?
        set(value): Unit = set(5, value)
        get(): Int? = get(5) as Int?

    open var imgId: Int?
        set(value): Unit = set(6, value)
        get(): Int? = get(6) as Int?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record1<Long?> = super.key() as Record1<Long?>

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row7<Long?, String?, String?, Int?, Int?, Int?, Int?> = super.fieldsRow() as Row7<Long?, String?, String?, Int?, Int?, Int?, Int?>
    override fun valuesRow(): Row7<Long?, String?, String?, Int?, Int?, Int?, Int?> = super.valuesRow() as Row7<Long?, String?, String?, Int?, Int?, Int?, Int?>
    override fun field1(): Field<Long?> = CarCards.CAR_CARDS.ID
    override fun field2(): Field<String?> = CarCards.CAR_CARDS.OWNER
    override fun field3(): Field<String?> = CarCards.CAR_CARDS.BRAND
    override fun field4(): Field<Int?> = CarCards.CAR_CARDS.CAR_MILEAGE
    override fun field5(): Field<Int?> = CarCards.CAR_CARDS.CAR_YEAR
    override fun field6(): Field<Int?> = CarCards.CAR_CARDS.COST
    override fun field7(): Field<Int?> = CarCards.CAR_CARDS.IMG_ID
    override fun component1(): Long? = id
    override fun component2(): String? = owner
    override fun component3(): String? = brand
    override fun component4(): Int? = carMileage
    override fun component5(): Int? = carYear
    override fun component6(): Int? = cost
    override fun component7(): Int? = imgId
    override fun value1(): Long? = id
    override fun value2(): String? = owner
    override fun value3(): String? = brand
    override fun value4(): Int? = carMileage
    override fun value5(): Int? = carYear
    override fun value6(): Int? = cost
    override fun value7(): Int? = imgId

    override fun value1(value: Long?): CarCardsRecord {
        set(0, value)
        return this
    }

    override fun value2(value: String?): CarCardsRecord {
        set(1, value)
        return this
    }

    override fun value3(value: String?): CarCardsRecord {
        set(2, value)
        return this
    }

    override fun value4(value: Int?): CarCardsRecord {
        set(3, value)
        return this
    }

    override fun value5(value: Int?): CarCardsRecord {
        set(4, value)
        return this
    }

    override fun value6(value: Int?): CarCardsRecord {
        set(5, value)
        return this
    }

    override fun value7(value: Int?): CarCardsRecord {
        set(6, value)
        return this
    }

    override fun values(value1: Long?, value2: String?, value3: String?, value4: Int?, value5: Int?, value6: Int?, value7: Int?): CarCardsRecord {
        this.value1(value1)
        this.value2(value2)
        this.value3(value3)
        this.value4(value4)
        this.value5(value5)
        this.value6(value6)
        this.value7(value7)
        return this
    }

    /**
     * Create a detached, initialised CarCardsRecord
     */
    constructor(id: Long? = null, owner: String? = null, brand: String? = null, carMileage: Int? = null, carYear: Int? = null, cost: Int? = null, imgId: Int? = null): this() {
        this.id = id
        this.owner = owner
        this.brand = brand
        this.carMileage = carMileage
        this.carYear = carYear
        this.cost = cost
        this.imgId = imgId
        resetChangedOnNotNull()
    }

    /**
     * Create a detached, initialised CarCardsRecord
     */
    constructor(value: mv.local.tables.pojos.CarCards?): this() {
        if (value != null) {
            this.id = value.id
            this.owner = value.owner
            this.brand = value.brand
            this.carMileage = value.carMileage
            this.carYear = value.carYear
            this.cost = value.cost
            this.imgId = value.imgId
            resetChangedOnNotNull()
        }
    }
}
