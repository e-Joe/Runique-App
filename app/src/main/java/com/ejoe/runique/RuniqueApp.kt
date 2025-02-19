package com.ejoe.runique

import android.app.Application
import com.ejoe.aut.presentation.di.authViewModelModule
import com.ejoe.auth.data.di.authDataModule
import com.ejoe.runique.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import timber.log.Timber

/**
 * Created by Ilija Vucetic on 19.2.25..
 * Copyright (c) 2025 Aktiia. All rights reserved.
 */
class RuniqueApp : Application() {

    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }

        startKoin {
            androidLogger()
            androidContext(this@RuniqueApp)
            modules(
                authDataModule,
                authViewModelModule,
                appModule
            )
        }
    }
}