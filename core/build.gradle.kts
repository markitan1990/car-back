import java.lang.System.getenv

plugins {
    id("org.springframework.boot")
    id("com.google.cloud.tools.jib")
    kotlin("plugin.spring")
}
version = "0.0.1-SNAPSHOT"

jib {
    from {
        image = "eclipse-temurin:$VER_JAVA-jdk"
    }
    to {
        image = "markitan1990/drivehub"
        tags = setOfNotNull(
            "$version"
        )
        auth {
            username = "markitan1990"
            password = "dckr_pat_TMUt0BSzAOhs8P8-vne_LR4A8kU"
        }
    }
    container {
        jvmFlags = listOf("-XX:+PrintFlagsFinal")
    }
}

dependencies {
    // Modules
    implementation(project(":api"))
    implementation(project(":persistent"))
    // Kotlin defaults
    implementation(kotlin("stdlib"))
    implementation(kotlin("reflect"))

    // Core
    implementation("org.springframework.boot:spring-boot-starter-web")
    developmentOnly("org.springframework.boot:spring-boot-devtools")

    implementation("org.apache.httpcomponents:httpclient:4.5.13")

    // Marshalling/Unmarshalling
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("com.fasterxml.jackson.datatype:jackson-datatype-jsr310")
    implementation("com.fasterxml.jackson.dataformat:jackson-dataformat-yaml")
    implementation("com.fasterxml.jackson.dataformat:jackson-dataformat-xml")

    annotationProcessor("org.springframework.boot:spring-boot-configuration-processor")
}
