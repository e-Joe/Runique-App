import androidx.room.gradle.RoomExtension
import com.ejoe.convetion.libs
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.dependencies

/**
 * Created by Ilija Vucetic on 29.1.25..
 * Copyright (c) 2025 Aktiia. All rights reserved.
 */
class AndroidRoomConventionPlugin: Plugin<Project> {

    override fun apply(target: Project) {
        target.run {
            pluginManager.run {
                apply("androidx.room")
                apply("com.google.devtools.ksp")
            }

            extensions.configure<RoomExtension> {
                schemaDirectory("$projectDir/schemas")
            }

            dependencies {
                "implementation"(libs.findLibrary("room.runtime").get())
                "implementation"(libs.findLibrary("room.ktx").get())
                "ksp"(libs.findLibrary("room.compiler").get())
            }
        }
    }
}