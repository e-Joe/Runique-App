package com.ejoe.aut.presentation.register

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.text2.input.TextFieldState
import com.ejoe.aut.domain.PasswordValidationState

/**
 * Created by Ilija Vucetic on 14.2.25..
 * Copyright (c) 2025 Aktiia. All rights reserved.
 */
@OptIn(ExperimentalFoundationApi::class)
data class RegisterState(
    val email: TextFieldState = TextFieldState(),
    val isEmailValid: Boolean = false,
    val password: TextFieldState = TextFieldState(),
    val isPasswordVisible: Boolean = false,
    val passwordValidationState: PasswordValidationState = PasswordValidationState(),
    val isRegistering: Boolean = false,
    val canRegister: Boolean = passwordValidationState.isValidPassword && !isRegistering
)
