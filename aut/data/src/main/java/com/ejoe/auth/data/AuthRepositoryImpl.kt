package com.ejoe.auth.data

import com.ejoe.aut.domain.AuthRepository
import com.ejoe.core.data.networking.post
import com.ejoe.core.domain.util.DataError
import com.ejoe.core.domain.util.EmptyResult
import io.ktor.client.HttpClient

/**
 * Created by Ilija Vucetic on 20.2.25..
 * Copyright (c) 2025 Aktiia. All rights reserved.
 */
class AuthRepositoryImpl(
    private val httpClient: HttpClient
) : AuthRepository {

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