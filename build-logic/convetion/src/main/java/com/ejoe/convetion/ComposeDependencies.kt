package com.ejoe.convetion

import org.gradle.api.Project
import org.gradle.kotlin.dsl.DependencyHandlerScope
import org.gradle.kotlin.dsl.project

/**
 * Created by Ilija Vucetic on 29.1.25..
 * Copyright (c) 2025 Aktiia. All rights reserved.
 */

fun DependencyHandlerScope.addUiLayerDependencies(project: Project) {
    "implementation"(project(":core:presentation:ui"))
    "implementation"(project(":core:presentation:designsystem"))

    "implementation"(project.libs.findBundle("koin.compose").get())
    "implementation"(project.libs.findBundle("compose").get())
    "debugImplementation"(project.libs.findBundle("compose.debug").get())
    "androidTestImplementation"(project.libs.findLibrary("androidx.compose.ui.test.junit4").get())
}