package mv.local.api.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema

/**
 * 
 * @param year 
 * @param price 
 * @param engine 
 * @param face 
 * @param volume 
 * @param fuel 
 * @param discount 
 */
data class CalculateRequest(

    @Schema(example = "null", description = "")
    @get:JsonProperty("year") var year: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("price") var price: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("engine") var engine: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("face") var face: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("volume") var volume: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("fuel") var fuel: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("discount") var discount: kotlin.Boolean? = null
) {

}

