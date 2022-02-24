pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}

rootProject.name = "Modular"
include(":androidApp")
include(":modular")
include(":shared:common")
include(":shared:network")
