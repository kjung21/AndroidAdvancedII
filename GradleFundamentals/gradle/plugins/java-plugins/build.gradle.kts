plugins {
    `kotlin-dsl`

    id("java-gradle-plugin")
    id("groovy-gradle-plugin")
}

gradlePlugin {
    plugins.create("MyJavaBase") {
        id = "my-java-base"
        implementationClass = "com.kryptopass.gradle.MyJavaBasePlugin"
    }
    plugins.create("MyJavaLibrary") {
        id = "my-java-library"
        implementationClass = "com.kryptopass.gradle.MyJavaLibraryPlugin"
    }
    plugins.create("MyJavaApplication") {
        id = "my-java-application"
        implementationClass = "com.kryptopass.gradle.MyJavaApplicationPlugin"
    }
}

dependencies {
    implementation("com.diffplug.spotless:spotless-plugin-gradle:6.8.0")
    // implementation("com.autonomousapps:dependency-analysis-gradle-plugin:1.4.0")
}