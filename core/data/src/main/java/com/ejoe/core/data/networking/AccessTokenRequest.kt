package com.ejoe.core.data.networking

import kotlinx.serialization.Serializable

/**
 * Created by Ilija Vucetic on 3.3.25..
 * Copyright (c) 2025 Aktiia. All rights reserved.
 */
@Serializable
data class AccessTokenRequest(
    val refreshToken: String,
    val userId: String
)