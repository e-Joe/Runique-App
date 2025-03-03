package com.ejoe.core.data.auth

import com.ejoe.core.domain.AuthInfo

/**
 * Created by Ilija Vucetic on 21.2.25..
 * Copyright (c) 2025 Aktiia. All rights reserved.
 */
fun AuthInfo.toAuthInfoSerializable(): AuthInfoSerializable {
    return AuthInfoSerializable(
        accessToken = accessToken,
        refreshToken = refreshToken,
        userId = userId
    )
}

fun AuthInfoSerializable.toAuthInfo(): AuthInfo {
    return AuthInfo(
        accessToken = accessToken,
        refreshToken = refreshToken,
        userId = userId
    )
}