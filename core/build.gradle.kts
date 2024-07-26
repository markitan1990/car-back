plugins {
    id("org.springframework.boot")

    kotlin("plugin.spring")
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

    //DB
//    implementation("org.springframework.boot:spring-boot-starter-jooq")
//    implementation("org.jooq:jooq")
//    implementation("org.jooq:jooq-meta")
//    implementation("org.flywaydb:flyway-core")
//    runtimeOnly("org.postgresql:postgresql")


    // Marshalling/Unmarshalling
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("com.fasterxml.jackson.datatype:jackson-datatype-jsr310")
    implementation("com.fasterxml.jackson.dataformat:jackson-dataformat-yaml")
    implementation("com.fasterxml.jackson.dataformat:jackson-dataformat-xml")

    annotationProcessor("org.springframework.boot:spring-boot-configuration-processor")
}
