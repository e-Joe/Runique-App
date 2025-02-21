package com.ejoe.auth.data

import kotlinx.serialization.Serializable

/**
 * Created by Ilija Vucetic on 20.2.25..
 * Copyright (c) 2025 Aktiia. All rights reserved.
 */
@Serializable
data class RegisterRequest(
    val email: String,
    val password: String
)
