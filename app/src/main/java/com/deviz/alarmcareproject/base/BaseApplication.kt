package com.deviz.alarmcareproject.base

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber

@HiltAndroidApp
class BaseApplication: Application() {
    override fun onCreate() {
        super.onCreate()

            //수정 필요
            Timber.plant(Timber.DebugTree())

    }
}