pluginManagement {
    repositories {
        gradlePluginPortal()
        // google()
        // mavenCentral()
        // maven("https://my.location.repo") {
            // credentials {
                // username = "user"
                // password = "password"
            // }
        // }
    }

    includeBuild("gradle/plugins")
}

dependencyResolutionManagement {
    @Suppress("UnstableApiUsage")
    repositories {
        mavenCentral()
        // google()
        // maven("https://my.location.repo") {
            // credentials {
                // username = "user"
                // password = "password"
            // }
        // }
    }

    // includeBuild("../my-other-project")
    includeBuild("gradle/platform")
}

rootProject.name = "Gradle Fundamentals"

include("app")
include("business-logic")
include("data-model")