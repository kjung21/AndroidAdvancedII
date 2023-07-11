plugins {
    id("ksc-application")
}

application {
    mainClass.set("com.kryptopass.Application")
}

dependencies {
    implementation(platform("com.kryptopass:platform"))

    implementation(project(":data-model"))
    implementation(project(":business-logic"))
    implementation("org.apache.commons:commons-lang3")

    runtimeOnly("org.slf4j:slf4j-simple")
    // runtimeOnly("libs.slf4j.simple")
}