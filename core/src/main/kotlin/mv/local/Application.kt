package mv.local

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.runApplication
import java.time.ZoneOffset.UTC
import java.util.*

@SpringBootApplication(
    scanBasePackages = ["mv.local"]
)
@ConfigurationPropertiesScan("mv.local")
class Application

fun main(args: Array<String>) {
    TimeZone.setDefault(TimeZone.getTimeZone(UTC))
    runApplication<Application>(*args)
}