package com.ejoe.aut.presentation.register

/**
 * Created by Ilija Vucetic on 14.2.25..
 * Copyright (c) 2025 Aktiia. All rights reserved.
 */
sealed interface RegisterAction {
    data object OnTogglePasswordVisibilityClick: RegisterAction
    data object OnLoginClick: RegisterAction
    data object OnRegisterClick: RegisterAction
}