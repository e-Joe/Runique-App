package com.ejoe.aut.presentation.intro

/**
 * Created by Ilija Vucetic on 11.2.25..
 * Copyright (c) 2025 Aktiia. All rights reserved.
 */
sealed interface IntroAction {
    data object OnSignInClick: IntroAction
    data object OnSignUpClick: IntroAction
}