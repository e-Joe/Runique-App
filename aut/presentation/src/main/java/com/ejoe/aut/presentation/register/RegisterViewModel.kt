@file:Suppress("OPT_IN_USAGE_FUTURE_ERROR")

package com.ejoe.aut.presentation.register

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.text2.input.textAsFlow
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ejoe.aut.domain.UserDataValidator
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach

/**
 * Created by Ilija Vucetic on 14.2.25..
 * Copyright (c) 2025 Aktiia. All rights reserved.
 */
@OptIn(ExperimentalFoundationApi::class)
class RegisterViewModel(
    private val userDataValidator: UserDataValidator
) : ViewModel() {

    var state by mutableStateOf(RegisterState())
        private set

    init {
        state.email.textAsFlow()
            .onEach { email ->
                val isValidEmail = userDataValidator.isEmailValid(email.toString())
                state = state.copy(
                    isEmailValid = isValidEmail,
                    canRegister = isValidEmail && state.passwordValidationState.isValidPassword
                            && !state.isRegistering
                )
            }
            .launchIn(viewModelScope)

        state.password.textAsFlow()
            .onEach { password ->
                val passwordValidationState =
                    userDataValidator.validatePassword(password.toString())
                state = state.copy(
                    passwordValidationState = passwordValidationState,
                    canRegister = state.isEmailValid && passwordValidationState.isValidPassword
                            && !state.isRegistering
                )
            }
            .launchIn(viewModelScope)
    }

    fun onAction(action: RegisterAction) {

    }
}