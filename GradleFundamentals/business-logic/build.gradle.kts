plugins {
    id("ksc-java-library")
}

dependencies {
    implementation(platform("com.kryptopass:platform"))

    implementation(project(":data-model"))
    implementation("org.apache.commons:commons-lang3")
    implementation("org.slf4j:slf4j-api")
    // implementation("libs.commons.lang")
    // implementation("libs.slf4j.api")

    // api("") <-- dependency is transitively visible as compilation

    // runtimeOnly("group:name")
    // compileOnly("group:name")

    testImplementation("org.junit.jupiter:junit-jupiter-api")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")

    // integrationTestImplementation("org.junit.jupiter:junit-jupiter-api")
    // integrationTestRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")

    // integrationTestImplementation("...")
}

//configurations {
//    compileClasspath
//    runtimeClasspath
//    compileClasspath.extendsFrom(implementation)
//}