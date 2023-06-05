package com.kryptopass.login

import android.app.Application
import timber.log.Timber

class LoginApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
    }
}