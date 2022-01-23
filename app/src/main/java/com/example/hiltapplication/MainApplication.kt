package com.example.hiltapplication

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber


// @4 Creamos main application y le agregamos la anotación @HiltAndroidApp, para que se active la generación de código Hilt y sea un contenedor de dependencias.
@HiltAndroidApp
class MainApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        if(BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
    }
}