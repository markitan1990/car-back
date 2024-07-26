/*
 * This file is generated by jOOQ.
 */
package mv.local.tables


import java.util.function.Function

import mv.local.Cars
import mv.local.keys.CAR_CARDS_PKEY
import mv.local.tables.records.CarCardsRecord

import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Identity
import org.jooq.Name
import org.jooq.Record
import org.jooq.Records
import org.jooq.Row9
import org.jooq.Schema
import org.jooq.SelectField
import org.jooq.Table
import org.jooq.TableField
import org.jooq.TableOptions
import org.jooq.UniqueKey
import org.jooq.impl.DSL
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType
import org.jooq.impl.TableImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class CarCards(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, CarCardsRecord>?,
    aliased: Table<CarCardsRecord>?,
    parameters: Array<Field<*>?>?
): TableImpl<CarCardsRecord>(
    alias,
    Cars.CARS,
    child,
    path,
    aliased,
    parameters,
    DSL.comment(""),
    TableOptions.table()
) {
    companion object {

        /**
         * The reference instance of <code>cars.car_cards</code>
         */
        val CAR_CARDS: CarCards = CarCards()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<CarCardsRecord> = CarCardsRecord::class.java

    /**
     * The column <code>cars.car_cards.id</code>.
     */
    val ID: TableField<CarCardsRecord, Long?> = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "")

    /**
     * The column <code>cars.car_cards.owner</code>.
     */
    val OWNER: TableField<CarCardsRecord, String?> = createField(DSL.name("owner"), SQLDataType.CLOB.nullable(false).defaultValue(DSL.field(DSL.raw("'mark'::text"), SQLDataType.CLOB)), this, "")

    /**
     * The column <code>cars.car_cards.car_mileage</code>.
     */
    val CAR_MILEAGE: TableField<CarCardsRecord, Int?> = createField(DSL.name("car_mileage"), SQLDataType.INTEGER.nullable(false), this, "")

    /**
     * The column <code>cars.car_cards.car_year</code>.
     */
    val CAR_YEAR: TableField<CarCardsRecord, Int?> = createField(DSL.name("car_year"), SQLDataType.INTEGER.nullable(false), this, "")

    /**
     * The column <code>cars.car_cards.cost</code>.
     */
    val COST: TableField<CarCardsRecord, Int?> = createField(DSL.name("cost"), SQLDataType.INTEGER.nullable(false), this, "")

    /**
     * The column <code>cars.car_cards.car_condition</code>.
     */
    val CAR_CONDITION: TableField<CarCardsRecord, String?> = createField(DSL.name("car_condition"), SQLDataType.CLOB.nullable(false), this, "")

    /**
     * The column <code>cars.car_cards.car_engine</code>.
     */
    val CAR_ENGINE: TableField<CarCardsRecord, Double?> = createField(DSL.name("car_engine"), SQLDataType.DOUBLE.nullable(false), this, "")

    /**
     * The column <code>cars.car_cards.description</code>.
     */
    val DESCRIPTION: TableField<CarCardsRecord, String?> = createField(DSL.name("description"), SQLDataType.CLOB.nullable(false), this, "")

    /**
     * The column <code>cars.car_cards.transmission</code>.
     */
    val TRANSMISSION: TableField<CarCardsRecord, String?> = createField(DSL.name("transmission"), SQLDataType.CLOB.nullable(false), this, "")

    private constructor(alias: Name, aliased: Table<CarCardsRecord>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<CarCardsRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>cars.car_cards</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>cars.car_cards</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>cars.car_cards</code> table reference
     */
    constructor(): this(DSL.name("car_cards"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, CarCardsRecord>): this(Internal.createPathAlias(child, key), child, key, CAR_CARDS, null)
    override fun getSchema(): Schema? = if (aliased()) null else Cars.CARS
    override fun getIdentity(): Identity<CarCardsRecord, Long?> = super.getIdentity() as Identity<CarCardsRecord, Long?>
    override fun getPrimaryKey(): UniqueKey<CarCardsRecord> = CAR_CARDS_PKEY
    override fun `as`(alias: String): CarCards = CarCards(DSL.name(alias), this)
    override fun `as`(alias: Name): CarCards = CarCards(alias, this)
    override fun `as`(alias: Table<*>): CarCards = CarCards(alias.getQualifiedName(), this)

    /**
     * Rename this table
     */
    override fun rename(name: String): CarCards = CarCards(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): CarCards = CarCards(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): CarCards = CarCards(name.getQualifiedName(), null)

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row9<Long?, String?, Int?, Int?, Int?, String?, Double?, String?, String?> = super.fieldsRow() as Row9<Long?, String?, Int?, Int?, Int?, String?, Double?, String?, String?>

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    fun <U> mapping(from: (Long?, String?, Int?, Int?, Int?, String?, Double?, String?, String?) -> U): SelectField<U> = convertFrom(Records.mapping(from))

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    fun <U> mapping(toType: Class<U>, from: (Long?, String?, Int?, Int?, Int?, String?, Double?, String?, String?) -> U): SelectField<U> = convertFrom(toType, Records.mapping(from))
}
