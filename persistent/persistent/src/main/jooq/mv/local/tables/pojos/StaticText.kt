/*
 * This file is generated by jOOQ.
 */
package mv.local.tables.pojos


import java.io.Serializable


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
data class StaticText(
    var id: Long? = null,
    var classId: String? = null,
    var description: String? = null
): Serializable {


    override fun toString(): String {
        val sb = StringBuilder("StaticText (")

        sb.append(id)
        sb.append(", ").append(classId)
        sb.append(", ").append(description)

        sb.append(")")
        return sb.toString()
    }
}
