package com.ejoe.auth.data

import android.util.Patterns
import com.ejoe.aut.domain.PatternValidator

/**
 * Created by Ilija Vucetic on 19.2.25..
 * Copyright (c) 2025 Aktiia. All rights reserved.
 */
object EmailPatternValidator : PatternValidator {

    override fun matches(value: String): Boolean {
        return Patterns.EMAIL_ADDRESS.matcher(value).matches()
    }
}