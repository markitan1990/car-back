/*
 * This file is generated by jOOQ.
 */
package mv.local.tables.records


import mv.local.tables.StaticText

import org.jooq.Field
import org.jooq.Record1
import org.jooq.Record3
import org.jooq.Row3
import org.jooq.impl.UpdatableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class StaticTextRecord() : UpdatableRecordImpl<StaticTextRecord>(StaticText.STATIC_TEXT), Record3<Long?, String?, String?> {

    open var id: Long?
        set(value): Unit = set(0, value)
        get(): Long? = get(0) as Long?

    open var classId: String?
        set(value): Unit = set(1, value)
        get(): String? = get(1) as String?

    open var description: String?
        set(value): Unit = set(2, value)
        get(): String? = get(2) as String?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record1<Long?> = super.key() as Record1<Long?>

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row3<Long?, String?, String?> = super.fieldsRow() as Row3<Long?, String?, String?>
    override fun valuesRow(): Row3<Long?, String?, String?> = super.valuesRow() as Row3<Long?, String?, String?>
    override fun field1(): Field<Long?> = StaticText.STATIC_TEXT.ID
    override fun field2(): Field<String?> = StaticText.STATIC_TEXT.CLASS_ID
    override fun field3(): Field<String?> = StaticText.STATIC_TEXT.DESCRIPTION
    override fun component1(): Long? = id
    override fun component2(): String? = classId
    override fun component3(): String? = description
    override fun value1(): Long? = id
    override fun value2(): String? = classId
    override fun value3(): String? = description

    override fun value1(value: Long?): StaticTextRecord {
        set(0, value)
        return this
    }

    override fun value2(value: String?): StaticTextRecord {
        set(1, value)
        return this
    }

    override fun value3(value: String?): StaticTextRecord {
        set(2, value)
        return this
    }

    override fun values(value1: Long?, value2: String?, value3: String?): StaticTextRecord {
        this.value1(value1)
        this.value2(value2)
        this.value3(value3)
        return this
    }

    /**
     * Create a detached, initialised StaticTextRecord
     */
    constructor(id: Long? = null, classId: String? = null, description: String? = null): this() {
        this.id = id
        this.classId = classId
        this.description = description
        resetChangedOnNotNull()
    }

    /**
     * Create a detached, initialised StaticTextRecord
     */
    constructor(value: mv.local.tables.pojos.StaticText?): this() {
        if (value != null) {
            this.id = value.id
            this.classId = value.classId
            this.description = value.description
            resetChangedOnNotNull()
        }
    }
}
