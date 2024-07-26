# Используем базовый образ для сборки Gradle с JDK 17
FROM gradle:7.4.2-jdk17 AS build

# Создаем рабочую директорию
WORKDIR /app

# Копируем файлы проекта
COPY . .

# Собираем проект
RUN gradle build --no-daemon

# Используем базовый образ OpenJDK 17 для запуска
FROM openjdk:17-jdk-slim

# Создаем рабочую директорию
WORKDIR /app

# Копируем собранный jar файл
COPY --from=build /app/build/libs/*.jar app.jar

# Открываем порт 8080
EXPOSE 8080

# Запускаем Spring Boot приложение
CMD ["java", "-jar", "app.jar"]
