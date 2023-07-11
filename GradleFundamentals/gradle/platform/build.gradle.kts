plugins {
    id("java-platform") // Similar to BOM == Bill Of Material
}

group = "com.kryptopass"

javaPlatform.allowDependencies()
dependencies {
    api(platform("com.fasterxml.jackson:jackson-bom:2.13.2"))
}

dependencies.constraints {
    api("org.apache.commons:commons-lang3:3.12.0")
    api("org.slf4j:slf4j-api:1.7.36")
    api("org.slf4j:slf4j-simple:1.7.36")

//    api("com.google.guava:guava:30.1.1-jre") {
//        version {
//            strictly("30.1.1-jre")
//            reject("30.1.1")
//        }
//    }
}
