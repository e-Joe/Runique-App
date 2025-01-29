import com.ejoe.convetion.configureKotlinJvm
import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * Created by Ilija Vucetic on 29.1.25..
 * Copyright (c) 2025 Aktiia. All rights reserved.
 */
class JvmLibraryConventionPlugin: Plugin<Project> {

    override fun apply(target: Project) {
        target.run {
            pluginManager.apply("org.jetbrains.kotlin.jvm")

            configureKotlinJvm()
        }
    }
}