plugins {
    id("org.openapi.generator")
}

dependencies {
    compileOnly("org.springdoc:springdoc-openapi-ui")
}

val packagePath = "mv.local.api"

openApiGenerate {
    generatorName.set("kotlin-spring")
    inputSpec.set("$projectDir/src/main/resources/openapi.yml")
    outputDir.set("$projectDir")
    modelPackage.set("$packagePath.model")
    apiPackage.set(packagePath)
    configOptions.set(
        mapOf(
            "useSpringBoot3" to "true",
            "exceptionHandler" to "false",
            "gradleBuildFile" to "false",
            "useTags" to "true",
            "interfaceOnly" to "true",
            "serviceInterface" to "true",
            "skipDefaultInterface" to "true",
            "enumPropertyNaming" to "UPPERCASE",
            "useBeanValidation" to "false",
            "modelMutable" to "true"
        )
    )
}

tasks.openApiGenerate {
    doFirst {
        delete("$projectDir/src/main/kotlin/${packagePath.replace(".", "/")}")
    }
    doLast {
        delete("$projectDir/.openapi-generator")
    }
}