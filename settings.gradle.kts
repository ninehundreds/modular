pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}

rootProject.name = "Modular"
include(":androidApp")
include(":shared")
include(":common")
