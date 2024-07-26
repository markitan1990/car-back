plugins {
    id("nu.studer.jooq") version "5.2.1"
    id("org.flywaydb.flyway") version "8.5.13"
}

dependencies {
    jooqGenerator("org.postgresql:postgresql")
}

flyway {
    url = "jdbc:postgresql://localhost:5432/car"
    user = "postgres"
    password = "postgres"
    locations = arrayOf("filesystem:$projectDir/src/main/resources/sql")
    schemas = arrayOf("cars")
    defaultSchema = "cars"
}

val pgAddressProperty = providers.systemProperty("PG_ADDRESS").forUseAtConfigurationTime().orNull
val jooqSources = "$projectDir/src/main/jooq"
val postgresqlAddress = pgAddressProperty ?: "localhost:5432"

jooq {
    version.set(dependencyManagement.importedProperties["jooq.version"])

    configurations {
        create("main") {
            generateSchemaSourceOnCompilation.set(false)

            jooqConfiguration.apply {
                logging = org.jooq.meta.jaxb.Logging.WARN

                jdbc.apply {
                    driver = "org.postgresql.Driver"
                    url = "jdbc:postgresql://$postgresqlAddress/car"
                    username = "postgres"
                    password = "postgres"
                }

                generator.apply {
                    name = "org.jooq.codegen.KotlinGenerator"

                    database.apply {
                        schemata.addAll(arrayOf(
                            org.jooq.meta.jaxb.SchemaMappingType().apply { inputSchema = "cars" }
                        ))
                        excludes = "flyway_.*"
                    }

                    generate.apply {
                        isRecords = true
                        isDaos = true
                        isPojosAsKotlinDataClasses = true
                        isSpringAnnotations = true
                        isPojos = true
                    }

                    target.apply {
                        directory = jooqSources
                        packageName = "mv.local"
                    }
                }
            }
        }
    }
}
sourceSets["main"].java.srcDir(file(jooqSources))

tasks {
    named("generateJooq") {
        dependsOn(flywayMigrate)
    }

    jar {
        enabled = true
    }
}