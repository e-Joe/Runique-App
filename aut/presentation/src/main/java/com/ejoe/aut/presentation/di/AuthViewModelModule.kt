package com.ejoe.aut.presentation.di

import com.ejoe.aut.presentation.register.RegisterViewModel
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.dsl.module

/**
 * Created by Ilija Vucetic on 19.2.25..
 * Copyright (c) 2025 Aktiia. All rights reserved.
 */

val authViewModelModule = module {
    viewModelOf(::RegisterViewModel)
}