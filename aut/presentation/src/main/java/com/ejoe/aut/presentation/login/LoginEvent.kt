package com.ejoe.aut.presentation.login

import com.ejoe.core.presentation.ui.UiText

/**
 * Created by Ilija Vucetic on 3.3.25..
 * Copyright (c) 2025 Aktiia. All rights reserved.
 */
sealed interface LoginEvent {
    data class Error(val error: UiText): LoginEvent
    data object LoginSuccess: LoginEvent
}