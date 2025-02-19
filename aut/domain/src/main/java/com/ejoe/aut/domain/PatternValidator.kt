package com.ejoe.aut.domain

/**
 * Created by Ilija Vucetic on 19.2.25..
 * Copyright (c) 2025 Aktiia. All rights reserved.
 */
interface PatternValidator {

    fun matches(value: String) : Boolean
}