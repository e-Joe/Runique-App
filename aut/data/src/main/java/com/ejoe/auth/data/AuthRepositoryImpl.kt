package com.ejoe.auth.data

import com.ejoe.aut.domain.AuthRepository
import com.ejoe.core.data.networking.post
import com.ejoe.core.domain.AuthInfo
import com.ejoe.core.domain.SessionStorage
import com.ejoe.core.domain.util.DataError
import com.ejoe.core.domain.util.EmptyResult
import com.ejoe.core.domain.util.asEmptyDataResult
import io.ktor.client.HttpClient
import com.ejoe.core.domain.util.Result

/**
 * Created by Ilija Vucetic on 20.2.25..
 * Copyright (c) 2025 Aktiia. All rights reserved.
 */

class AuthRepositoryImpl(
    private val httpClient: HttpClient,
    private val sessionStorage: SessionStorage
) : AuthRepository {

    override suspend fun login(email: String, password: String): EmptyResult<DataError.Network> {
        val result = httpClient.post<LoginRequest, LoginResponse>(
            route = "/login",
            body = LoginRequest(
                email = email,
                password = password
            )
        )
        if (result is Result.Success) {
            sessionStorage.set(
                AuthInfo(
                    accessToken = result.data.accessToken,
                    refreshToken = result.data.refreshToken,
                    userId = result.data.userId
                )
            )
        }
        return result.asEmptyDataResult()
    }

    override suspend fun register(email: String, password: String): EmptyResult<DataError.Network> {
        return httpClient.post<RegisterRequest, Unit>(
            route = "/register",
            body = RegisterRequest(
                email = email,
                password = password
            )
        )
    }
}