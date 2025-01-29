import com.android.build.api.dsl.LibraryExtension
import com.ejoe.convetion.configureAndroidCompose
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.getByType

/**
 * Created by Ilija Vucetic on 29.1.25..
 * Copyright (c) 2025 Aktiia. All rights reserved.
 */
class AndroidLibraryComposeConventionPlugin : Plugin<Project> {

    override fun apply(target: Project) {
        target.run {
            pluginManager.run {
                apply("runique.android.library")
            }

            val extension = extensions.getByType<LibraryExtension>()
            configureAndroidCompose(extension)
        }
    }
}