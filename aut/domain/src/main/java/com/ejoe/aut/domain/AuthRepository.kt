package com.ejoe.aut.domain

import com.ejoe.core.domain.util.DataError
import com.ejoe.core.domain.util.EmptyResult

/**
 * Created by Ilija Vucetic on 20.2.25..
 * Copyright (c) 2025 Aktiia. All rights reserved.
 */
interface AuthRepository {
    suspend fun login(email: String, password: String): EmptyResult<DataError.Network>
    suspend fun register(email: String, password: String): EmptyResult<DataError.Network>
}