package com.sopt.now.sopkathon.android

import android.app.Application
import androidx.appcompat.app.AppCompatDelegate

class NaniseoApp : Application() {
    override fun onCreate() {
        super.onCreate()
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
    }
}