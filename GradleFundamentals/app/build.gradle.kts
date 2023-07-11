plugins {
    id("ksc-application")
}

application {
    mainClass.set("com.kryptopass.Application")
}

dependencies {
    implementation(project(":data-model"))
    implementation(project(":business-logic"))
}