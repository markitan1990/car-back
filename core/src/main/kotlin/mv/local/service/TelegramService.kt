package mv.local.service

import mv.local.api.model.FormRequest
import org.springframework.http.HttpEntity
import org.springframework.http.HttpHeaders
import org.springframework.http.HttpMethod
import org.springframework.http.MediaType
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate

@Service
class TelegramService(private val restTemplate: RestTemplate) {

    private val telegramBotToken = "6017491077:AAEi0rXGNX3EyhzL9jZMn5VIXg7lGe3t-E8"
    private val chatId = "461081229"

    fun sendForm(form: FormRequest) {
        val message = "Имя: ${form.name}\nНомер телефона: ${form.phoneNumber}"

        val headers = HttpHeaders()
        headers.contentType = MediaType.APPLICATION_JSON

        val requestBody = """
            {
                "chat_id": "$chatId",
                "text": "$message"
            }
        """.trimIndent()

        val entity = HttpEntity(requestBody, headers)

        val url = "https://api.telegram.org/bot$telegramBotToken/sendMessage"

        restTemplate.exchange(url, HttpMethod.POST, entity, String::class.java)
    }
}
