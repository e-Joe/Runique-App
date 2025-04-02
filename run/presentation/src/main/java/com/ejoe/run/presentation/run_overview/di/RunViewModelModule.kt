package com.ejoe.run.presentation.run_overview.di

import com.ejoe.run.presentation.run_overview.RunOverviewViewModel
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.dsl.module

/**
 * Created by Ilija Vucetic on 2.4.25..
 * Copyright (c) 2025 Aktiia. All rights reserved.
 */
val runViewModelModule = module {
    viewModelOf(::RunOverviewViewModel)
}