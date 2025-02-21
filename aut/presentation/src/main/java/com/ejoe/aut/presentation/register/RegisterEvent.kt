package com.ejoe.aut.presentation.register

import com.ejoe.core.presentation.ui.UiText

/**
 * Created by Ilija Vucetic on 20.2.25..
 * Copyright (c) 2025 Aktiia. All rights reserved.
 */
sealed interface RegisterEvent {
    data object RegistrationSuccess: RegisterEvent
    data class Error(val error: UiText): RegisterEvent
}