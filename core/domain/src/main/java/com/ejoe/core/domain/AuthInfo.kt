package com.ejoe.core.domain

/**
 * Created by Ilija Vucetic on 21.2.25..
 * Copyright (c) 2025 Aktiia. All rights reserved.
 */
data class AuthInfo(
    val accessToken: String,
    val refreshToken: String,
    val userId: String
)
