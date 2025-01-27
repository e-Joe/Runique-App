package com.ejoe.convetion

import org.gradle.api.Project
import org.gradle.api.artifacts.VersionCatalogsExtension
import org.gradle.kotlin.dsl.getByType

/**
 * Created by Ilija Vucetic on 27.1.25..
 * Copyright (c) 2025 Aktiia. All rights reserved.
 */

val Project.libs
    get() = extensions.getByType<VersionCatalogsExtension>().named("libs")