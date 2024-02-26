package src.main.carback

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CarBackApplication

fun main(args: Array<String>) {
    runApplication<CarBackApplication>(*args)
}
