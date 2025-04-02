package com.ejoe.run.presentation.run_overview

/**
 * Created by Ilija Vucetic on 2.4.25..
 * Copyright (c) 2025 Aktiia. All rights reserved.
 */
sealed interface RunOverviewAction {
    data object OnStartClick: RunOverviewAction
    data object OnLogoutClick: RunOverviewAction
    data object OnAnalyticsClick: RunOverviewAction
}