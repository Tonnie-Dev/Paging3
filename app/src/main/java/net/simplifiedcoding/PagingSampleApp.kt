package net.simplifiedcoding

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber

@HiltAndroidApp
class PagingSampleApp: Application(){
    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
    }
}