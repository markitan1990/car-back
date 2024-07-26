package mv.local.api

import mv.local.api.model.CalculateRequest
import mv.local.api.model.CalculateResponse
import mv.local.api.model.CarCardsResponse
import mv.local.api.model.FormRequest

interface AdminApiService {

    /**
     * POST /api/calc-fee : CalcApi
     * 
     *
     * @param calculateRequest  (required)
     * @return OK (status code 200)
     * @see AdminApi#calculate
     */
    fun calculate(calculateRequest: CalculateRequest): CalculateResponse

    /**
     * GET /api/car-cards : CarsApi
     * 
     *
     * @return  (status code 200)
     * @see AdminApi#getCarsCard
     */
    fun getCarsCard(): List<CarCardsResponse>

    /**
     * POST /api/submit-form : FormApi
     * 
     *
     * @param formRequest  (required)
     * @return OK (status code 200)
     * @see AdminApi#sendForm
     */
    fun sendForm(formRequest: FormRequest): Unit
}
