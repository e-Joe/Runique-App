package com.ejoe.aut.domain

/**
 * Created by Ilija Vucetic on 18.2.25..
 * Copyright (c) 2025 Aktiia. All rights reserved.
 */
class UserDataValidator ( private val patternValidator: PatternValidator) {

    companion object {
        const val MIN_PASSWORD_LENGTH = 9
    }

    fun isEmailValid(email: String): Boolean {
        return patternValidator.matches(email)
    }

    fun validatePassword(password: String): PasswordValidationState {
        val hasMinLength = password.length >= MIN_PASSWORD_LENGTH
        val hasDigit = password.any { it.isDigit() }
        val hasLowerCaseCharacter = password.any { it.isLowerCase() }
        val hasUpperCaseCharacter = password.any { it.isUpperCase() }

        return PasswordValidationState(
            hasMinLength = hasMinLength,
            hasNumber = hasDigit,
            hasLowerCaseCharacter = hasLowerCaseCharacter,
            hasUpperCaseCharacter = hasUpperCaseCharacter
        )
    }
}