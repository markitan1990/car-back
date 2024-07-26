/*
 * This file is generated by jOOQ.
 */
package mv.local.tables


import java.util.function.Function

import mv.local.Cars
import mv.local.keys.STATIC_TEXT_PKEY
import mv.local.tables.records.StaticTextRecord

import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Identity
import org.jooq.Name
import org.jooq.Record
import org.jooq.Records
import org.jooq.Row3
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
open class StaticText(
    alias: Name,
    child: Table<out Record>?,
    path: ForeignKey<out Record, StaticTextRecord>?,
    aliased: Table<StaticTextRecord>?,
    parameters: Array<Field<*>?>?
): TableImpl<StaticTextRecord>(
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
         * The reference instance of <code>cars.static_text</code>
         */
        val STATIC_TEXT: StaticText = StaticText()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<StaticTextRecord> = StaticTextRecord::class.java

    /**
     * The column <code>cars.static_text.id</code>.
     */
    val ID: TableField<StaticTextRecord, Long?> = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "")

    /**
     * The column <code>cars.static_text.class_id</code>.
     */
    val CLASS_ID: TableField<StaticTextRecord, String?> = createField(DSL.name("class_id"), SQLDataType.CLOB, this, "")

    /**
     * The column <code>cars.static_text.description</code>.
     */
    val DESCRIPTION: TableField<StaticTextRecord, String?> = createField(DSL.name("description"), SQLDataType.CLOB, this, "")

    private constructor(alias: Name, aliased: Table<StaticTextRecord>?): this(alias, null, null, aliased, null)
    private constructor(alias: Name, aliased: Table<StaticTextRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, aliased, parameters)

    /**
     * Create an aliased <code>cars.static_text</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>cars.static_text</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>cars.static_text</code> table reference
     */
    constructor(): this(DSL.name("static_text"), null)

    constructor(child: Table<out Record>, key: ForeignKey<out Record, StaticTextRecord>): this(Internal.createPathAlias(child, key), child, key, STATIC_TEXT, null)
    override fun getSchema(): Schema? = if (aliased()) null else Cars.CARS
    override fun getIdentity(): Identity<StaticTextRecord, Long?> = super.getIdentity() as Identity<StaticTextRecord, Long?>
    override fun getPrimaryKey(): UniqueKey<StaticTextRecord> = STATIC_TEXT_PKEY
    override fun `as`(alias: String): StaticText = StaticText(DSL.name(alias), this)
    override fun `as`(alias: Name): StaticText = StaticText(alias, this)
    override fun `as`(alias: Table<*>): StaticText = StaticText(alias.getQualifiedName(), this)

    /**
     * Rename this table
     */
    override fun rename(name: String): StaticText = StaticText(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): StaticText = StaticText(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): StaticText = StaticText(name.getQualifiedName(), null)

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------
    override fun fieldsRow(): Row3<Long?, String?, String?> = super.fieldsRow() as Row3<Long?, String?, String?>

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    fun <U> mapping(from: (Long?, String?, String?) -> U): SelectField<U> = convertFrom(Records.mapping(from))

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    fun <U> mapping(toType: Class<U>, from: (Long?, String?, String?) -> U): SelectField<U> = convertFrom(toType, Records.mapping(from))
}
