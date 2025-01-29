import com.android.build.api.dsl.ApplicationExtension
import com.ejoe.convetion.configureAndroidCompose
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.getByType

/**
 * Created by Ilija Vucetic on 28.1.25..
 * Copyright (c) 2025 Aktiia. All rights reserved.
 */
class AndroidApplicationComposeConventionPlugin: Plugin<Project> {

    override fun apply(target: Project) {
        target.run {
            pluginManager.apply("runique.android.application")

            val extension = extensions.getByType<ApplicationExtension>()
            configureAndroidCompose(extension)
        }
    }
}