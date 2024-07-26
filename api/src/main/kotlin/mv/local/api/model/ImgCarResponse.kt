package mv.local.api.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.v3.oas.annotations.media.Schema

/**
 * 
 * @param carCardsId 
 * @param link 
 */
data class ImgCarResponse(

    @Schema(example = "null", description = "")
    @get:JsonProperty("car_cards_id") var carCardsId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("link") var link: kotlin.String? = null
) {

}

