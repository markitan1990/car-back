package mv.local.api.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema

/**
 * 
 * @param name 
 * @param phoneNumber 
 */
data class FormRequest(

    @Schema(example = "null", description = "")
    @get:JsonProperty("name") var name: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("phoneNumber") var phoneNumber: kotlin.String? = null
) {

}

