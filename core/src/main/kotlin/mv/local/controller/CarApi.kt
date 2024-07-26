package mv.local.controller

import mv.local.api.AdminApi
import mv.local.api.AdminApiService
import mv.local.api.model.CalculateRequest
import mv.local.api.model.CalculateResponse
import mv.local.api.model.CarCardsResponse
import mv.local.api.model.FormRequest
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RestController

@RestController
class CarApi(private val service: AdminApiService) : AdminApi {
    override fun calculate(calculateRequest: CalculateRequest): ResponseEntity<CalculateResponse> {
        return ResponseEntity.ok(service.calculate(calculateRequest))
    }

    override fun getCarsCard(): ResponseEntity<List<CarCardsResponse>> {
        return ResponseEntity.ok(service.getCarsCard())
    }

    override fun sendForm(formRequest: FormRequest): ResponseEntity<Unit> {
        return ResponseEntity.ok(service.sendForm(formRequest))
    }
}