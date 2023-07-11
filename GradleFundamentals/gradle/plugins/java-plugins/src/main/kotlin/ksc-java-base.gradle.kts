import com.kryptopass.gradle.Slf4jSimpleRule

plugins {
    id("java")
    id("com.diffplug.spotless")
    // id("com.autonomousapps.dependency-analysis")
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

    }
    javadoc {

    }
}