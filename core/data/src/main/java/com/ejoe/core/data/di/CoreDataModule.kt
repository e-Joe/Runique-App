package com.ejoe.core.data.di

import com.ejoe.core.data.networking.HttpClientFactory
import org.koin.dsl.module

/**
 * Created by Ilija Vucetic on 21.2.25..
 * Copyright (c) 2025 Aktiia. All rights reserved.
 */
val coreDataModule = module {
    single {
        HttpClientFactory().build()
    }
}