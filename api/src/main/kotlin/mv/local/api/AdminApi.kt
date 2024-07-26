/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.3.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
*/
package mv.local.api

import mv.local.api.model.CalculateRequest
import mv.local.api.model.CalculateResponse
import mv.local.api.model.CarCardsResponse
import mv.local.api.model.FormRequest
import io.swagger.v3.oas.annotations.*
import io.swagger.v3.oas.annotations.enums.*
import io.swagger.v3.oas.annotations.media.*
import io.swagger.v3.oas.annotations.responses.*
import io.swagger.v3.oas.annotations.security.*
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity

import org.springframework.web.bind.annotation.*
import org.springframework.web.context.request.NativeWebRequest
import org.springframework.beans.factory.annotation.Autowired


import kotlin.collections.List
import kotlin.collections.Map

@RequestMapping("\${api.base-path:}")
interface AdminApi {

    @Operation(
        tags = ["admin",],
        summary = "CalcApi",
        operationId = "calculate",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "OK", content = [Content(schema = Schema(implementation = CalculateResponse::class))])
        ]
    )
    @RequestMapping(
            method = [RequestMethod.POST],
            value = ["/api/calc-fee"],
            produces = ["application/json"],
            consumes = ["application/json"]
    )
    fun calculate(@Parameter(description = "", required = true) @RequestBody calculateRequest: CalculateRequest): ResponseEntity<CalculateResponse>

    @Operation(
        tags = ["admin",],
        summary = "CarsApi",
        operationId = "getCarsCard",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "", content = [Content(array = ArraySchema(schema = Schema(implementation = CarCardsResponse::class)))])
        ]
    )
    @RequestMapping(
            method = [RequestMethod.GET],
            value = ["/api/car-cards"],
            produces = ["application/json"]
    )
    fun getCarsCard(): ResponseEntity<List<CarCardsResponse>>

    @Operation(
        tags = ["admin",],
        summary = "FormApi",
        operationId = "sendForm",
        description = """""",
        responses = [
            ApiResponse(responseCode = "200", description = "OK")
        ]
    )
    @RequestMapping(
            method = [RequestMethod.POST],
            value = ["/api/submit-form"],
            consumes = ["application/json"]
    )
    fun sendForm(@Parameter(description = "", required = true) @RequestBody formRequest: FormRequest): ResponseEntity<Unit>
}
