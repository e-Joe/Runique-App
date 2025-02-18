package com.ejoe.aut.domain

/**
 * Created by Ilija Vucetic on 14.2.25..
 * Copyright (c) 2025 Aktiia. All rights reserved.
 */
data class PasswordValidationState(
    val hasMinLength: Boolean = false,
    val hasNumber: Boolean = false,
    val hasLowerCaseCharacter: Boolean = false,
    val hasUpperCaseCharacter: Boolean = false
) {
    val isValidPassword: Boolean
        get() = hasMinLength && hasNumber && hasLowerCaseCharacter && hasUpperCaseCharacter
}