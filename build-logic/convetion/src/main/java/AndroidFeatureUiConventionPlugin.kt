import com.ejoe.convetion.addUiLayerDependencies
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

/**
 * Created by Ilija Vucetic on 29.1.25..
 * Copyright (c) 2025 Aktiia. All rights reserved.
 */
class AndroidFeatureUiConventionPlugin: Plugin<Project> {

    override fun apply(target: Project) {
        target.run {
            pluginManager.run {
                apply("runique.android.library.compose")
            }

            dependencies {
                addUiLayerDependencies(target)
            }
        }
    }
}