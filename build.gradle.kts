import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("io.spring.dependency-management") version VER_DEPENDENCY_MANAGEMENT
    id("org.springframework.boot") version VER_SPRING_BOOT apply false
    id("org.openapi.generator") version VER_OPENAPI_GENERATOR apply false

    kotlin("jvm") version VER_KOTLIN
    kotlin("plugin.spring") version VER_KOTLIN apply false
}

allprojects {

    repositories {
        mavenLocal()
        mavenCentral()
    }

    // Applying default plugins for each subproject
    apply {
        plugin("io.spring.dependency-management")
        plugin("org.jetbrains.kotlin.jvm")
    }

    // Static versioned dependencies, which are missing from io.spring.dependency-management
    dependencies {
        implementation("org.springdoc:springdoc-openapi-ui:$VER_SPRINGDOC")
        implementation("org.springframework.boot:spring-boot-starter-jooq")
        implementation("org.jooq:jooq")
        implementation("org.jooq:jooq-meta")
        implementation("org.flywaydb:flyway-core")
        runtimeOnly("org.postgresql:postgresql")
    }

    // Used to include non-versioned dependencies from org.springframework.boot plugin in subprojects
    dependencyManagement {
        // Override default bom versions
        ext["kotlin.version"] = VER_KOTLIN

        imports {
            mavenBom("org.springframework.boot:spring-boot-dependencies:$VER_SPRING_BOOT")
        }
    }

    tasks.withType<JavaCompile> {
        sourceCompatibility = VER_JAVA
        targetCompatibility = VER_JAVA
    }

    tasks.withType<KotlinCompile> {
        kotlinOptions {
            freeCompilerArgs = listOf("-Xjsr305=strict")
            jvmTarget = VER_JAVA
        }
    }

    tasks.withType<Test> {
        useJUnitPlatform()
    }
}