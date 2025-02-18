@file:Suppress("OPT_IN_USAGE_FUTURE_ERROR")

package com.ejoe.aut.presentation.register

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

/**
 * Created by Ilija Vucetic on 14.2.25..
 * Copyright (c) 2025 Aktiia. All rights reserved.
 */
class RegisterViewModel : ViewModel() {
    var state by mutableStateOf(RegisterState())
        private set

    fun onAction(action: RegisterAction) {

    }
}