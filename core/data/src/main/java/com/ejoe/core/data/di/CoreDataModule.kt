package com.ejoe.core.data.di

import com.ejoe.core.data.auth.EncryptedSessionStorage
import com.ejoe.core.data.networking.HttpClientFactory
import com.ejoe.core.domain.SessionStorage
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

/**
 * Created by Ilija Vucetic on 21.2.25..
 * Copyright (c) 2025 Aktiia. All rights reserved.
 */
val coreDataModule = module {
    single {
        HttpClientFactory(get()).build()
    }
    singleOf(::EncryptedSessionStorage).bind<SessionStorage>()
}