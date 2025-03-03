package com.ejoe.runique

/**
 * Created by Ilija Vucetic on 3.3.25..
 * Copyright (c) 2025 Aktiia. All rights reserved.
 */
data class MainState(
    val isLoggedIn: Boolean = false,
    val isCheckingAuth: Boolean = false
)