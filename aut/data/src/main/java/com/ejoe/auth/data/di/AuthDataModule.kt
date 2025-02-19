package com.ejoe.auth.data.di

import com.ejoe.aut.domain.PatternValidator
import com.ejoe.aut.domain.UserDataValidator
import com.ejoe.auth.data.EmailPatternValidator

import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module


/**
 * Created by Ilija Vucetic on 19.2.25..
 * Copyright (c) 2025 Aktiia. All rights reserved.
 */

val authDataModule = module {
    single<PatternValidator> {
        EmailPatternValidator
    }
    singleOf(::UserDataValidator)
}