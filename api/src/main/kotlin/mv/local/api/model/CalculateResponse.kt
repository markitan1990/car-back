package mv.local.api.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema

/**
 * 
 * @param answer 
 */
data class CalculateResponse(

    @Schema(example = "null", description = "")
    @get:JsonProperty("answer") var answer: kotlin.String? = null
) {

}

