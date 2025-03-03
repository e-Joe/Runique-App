package com.ejoe.core.data.auth

import kotlinx.serialization.Serializable

/**
 * Created by Ilija Vucetic on 21.2.25..
 * Copyright (c) 2025 Aktiia. All rights reserved.
 */
@Serializable
data class AuthInfoSerializable(
    val accessToken: String,
    val refreshToken: String,
    val userId: String
)
