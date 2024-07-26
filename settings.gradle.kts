pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
    }
}

rootProject.name = "car-back"

include(
    "core",
    "api",
    "persistent"
)