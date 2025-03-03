package com.ejoe.auth.data

import kotlinx.serialization.Serializable

/**
 * Created by Ilija Vucetic on 3.3.25..
 * Copyright (c) 2025 Aktiia. All rights reserved.
 */
@Serializable
data class LoginResponse(
    val accessToken: String,
    val refreshToken: String,
    val accessTokenExpirationTimestamp: Long,
    val userId: String
)