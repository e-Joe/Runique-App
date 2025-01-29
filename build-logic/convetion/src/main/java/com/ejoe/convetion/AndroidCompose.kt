package com.ejoe.convetion

/**
 * Created by Ilija Vucetic on 28.1.25..
 * Copyright (c) 2025 Aktiia. All rights reserved.
 */

import com.android.build.api.dsl.CommonExtension
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

internal fun Project.configureAndroidCompose(
    commonExtension: CommonExtension<*, *, *, *, *>
) {
    commonExtension.run {
        buildFeatures {
            compose = true
        }

        composeOptions {
            kotlinCompilerExtensionVersion = libs
                .findVersion("composeCompiler")
                .get()
                .toString()
        }

        dependencies {
            val bom = libs.findLibrary("androidx.compose.bom").get()
            "implementation"(platform(bom))
            "androidTestImplementation"(platform(bom))
            "debugImplementation"(libs.findLibrary("androidx.compose.ui.tooling.preview").get())
        }
    }
}