package com.mydigipay.challenge.app

import android.app.Application
import com.mydigipay.challenge.di.appModule
import com.mydigipay.challenge.di.networkModule
import com.mydigipay.challenge.di.repositoryModule
import com.mydigipay.challenge.di.restModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
            modules(
                listOf(
                    appModule, networkModule,
                    restModule, repositoryModule
                )
            )
        }
    }

}