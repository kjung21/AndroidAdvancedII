import com.kryptopass.gradle.JarCount

plugins {
    id("application")
    id("ksc-java-base")
}

tasks.register<JarCount>("countJars") {
    group = "my group"
    description = "Counts the number of jars in the application"

    allJars.from(tasks.jar)
    allJars.from(configurations.runtimeClasspath)

    countFile.set(layout.buildDirectory.file("gen/count.txt"))
}

tasks.register<Zip>("bundle") {
    group = "my group"
    description = "Bundles the application into a zip file"

    from(tasks.jar)
    from(configurations.runtimeClasspath)

    destinationDirectory.set(layout.buildDirectory.dir("distribution"))
}

tasks.build {
    dependsOn("bundle")
}

tasks.register("buildAll") {
    group = "my group"
    description = "Builds everything"

    dependsOn(tasks.build)
    dependsOn(tasks.named("countJars"))
}