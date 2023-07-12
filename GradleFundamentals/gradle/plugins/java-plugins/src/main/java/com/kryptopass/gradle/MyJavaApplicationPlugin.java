package com.kryptopass.gradle;

import org.gradle.api.Plugin;
import org.gradle.api.Project;
import org.gradle.api.tasks.bundling.Zip;

public abstract class MyJavaApplicationPlugin implements Plugin<Project> {
    @Override
    public void apply(Project project) {
        project.getPlugins().apply("application");
        project.getPlugins().apply("ksc-java-base");

        project.getTasks().register("countJars", JarCount.class, t -> {
            t.setGroup("my group");
            t.setDescription("Counts the number of jars in the application");

            t.getAllJars().from(project.getTasks().named("jar"));
            t.getAllJars().from(project.getConfigurations()
                    .getByName("runtimeClasspath"));

            t.getCountFile().set(project.getLayout().getBuildDirectory()
                    .file("gen/count.txt"));
        });

        project.getTasks().register("bundle", Zip.class, t -> {
            t.setGroup("my group");
            t.setDescription("Bundles the application into a zip file");

            t.from(project.getTasks().named("jar"));
            t.from(project.getConfigurations().getByName("runtimeClasspath"));

            t.getDestinationDirectory().set(project.getLayout()
                    .getBuildDirectory().dir("distribution"));
        });

        project.getTasks().named("build", t -> {
            t.dependsOn(project.getTasks().named("bundle"));
        });

        project.getTasks().register("buildAll", t -> {
            t.setGroup("my group");
            t.setDescription("Builds everything");

            t.dependsOn(project.getTasks().named("build"));
            t.dependsOn(project.getTasks().named("countJars"));
        });
    }
}
