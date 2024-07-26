package mv.local.service

import mv.local.api.AdminApiService
import mv.local.api.model.CalculateRequest
import mv.local.api.model.CalculateResponse
import mv.local.api.model.CarCardsResponse
import mv.local.api.model.FormRequest
import mv.local.repository.CarRepository
import org.springframework.stereotype.Service

@Service
class AdminService(
    private val repo: CarRepository,
    private val telegramService: TelegramService
) : AdminApiService {
    override fun calculate(calculateRequest: CalculateRequest): CalculateResponse {
        return CalculateResponse("Очень много платить придется я вам отвечаю")
    }

    override fun getCarsCard(): List<CarCardsResponse> {
        return repo.getCarsWithImages()
    }

    override fun sendForm(form: FormRequest) {
        telegramService.sendForm(form)
    }
}