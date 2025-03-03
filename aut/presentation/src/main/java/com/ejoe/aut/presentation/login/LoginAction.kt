package com.ejoe.aut.presentation.login

/**
 * Created by Ilija Vucetic on 3.3.25..
 * Copyright (c) 2025 Aktiia. All rights reserved.
 */
sealed interface LoginAction {
    data object OnTogglePasswordVisibility: LoginAction
    data object OnLoginClick: LoginAction
    data object OnRegisterClick: LoginAction
}