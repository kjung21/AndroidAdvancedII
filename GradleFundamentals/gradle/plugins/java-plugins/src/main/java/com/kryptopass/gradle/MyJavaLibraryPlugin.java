package com.kryptopass.gradle;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

public abstract class MyJavaLibraryPlugin implements Plugin<Project> {
    @Override
    public void apply(Project project) {
        project.getPlugins().apply("java-library");
        project.getPlugins().apply("ksc-java-base");
    }
}
