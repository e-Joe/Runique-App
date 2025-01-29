import com.ejoe.convetion.libs
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

/**
 * Created by Ilija Vucetic on 29.1.25..
 * Copyright (c) 2025 Aktiia. All rights reserved.
 */
class JvmKtorConventionPlugin: Plugin<Project> {

    override fun apply(target: Project) {
        target.run {
            pluginManager.apply("org.jetbrains.kotlin.plugin.serialization")

            dependencies {
                "implementation"(libs.findBundle("ktor").get())
            }
        }
    }
}