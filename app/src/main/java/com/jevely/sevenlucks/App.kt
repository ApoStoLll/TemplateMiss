package com.jevely.sevenlucks

import android.app.Application
import com.jevely.sevenlucks.di.appModule
import com.jevely.sevenlucks.di.dataSourceModule
import com.onesignal.OneSignal
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@App)
            androidLogger()
            modules(appModule, dataSourceModule)
        }
        // Enable verbose OneSignal logging to debug issues if needed.
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE)

        // OneSignal Initialization
        OneSignal.initWithContext(this)
        OneSignal.setAppId(ONESIGNAL_APP_ID)
    }

    companion object {
        const val AF_DEV_KEY = "pgpHoMctstcWM8f7KaiqjQ"
        const val BASE_URL = "http://185.179.188.83/53npk4"
        const val ORGANIC_URL = "http://185.179.188.83/53npk4"
        const val URL_REDIRECT = "github.com"
        const val PACKAGE = "com.jevely.sevenlucks"
        private const val ONESIGNAL_APP_ID = "2a5e5268-a311-42ce-a162-d7a320ae0912"
    }
}