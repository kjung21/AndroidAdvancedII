import com.kryptopass.gradle.Slf4jSimpleRule

plugins {
    id("java")
    id("com.diffplug.spotless")
    // id("com.autonomousapps.dependency-analysis")
}

sourceSets.main {
    // java.setSrcDirs(listOf(layout.projectDirectory.dir("sources")))
}
sourceSets.test

sourceSets.create("integrationTest")

tasks.register<Test>("integrationTest") {
    testClassesDirs = sourceSets["integrationTest"].output.classesDirs
    classpath = sourceSets["integrationTest"].runtimeClasspath

    useJUnitPlatform()
}

dependencies.components {
    withModule<Slf4jSimpleRule>("org.slf4j:slf4j-simple")
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

tasks.withType<JavaCompile>().configureEach {
    options.encoding = "UTF-8"
}

tasks {
    compileJava {

    }
    compileTestJava {

    }
    test {
        useJUnitPlatform {
            excludeTags("slow")
        }

        maxParallelForks = 4
        maxHeapSize = "2g"
    }
    register<Test>("testSlow") {
        testClassesDirs = sourceSets.test.get().output.classesDirs
        classpath = sourceSets.test.get().runtimeClasspath

        useJUnitPlatform {
            includeTags("slow")
        }
    }
    check {
        dependsOn("testSlow")
    }
    javadoc {

    }
}