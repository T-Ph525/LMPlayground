package com.druk.lmplayground

import android.app.Application
import com.druk.llamacpp.LlamaCpp
import com.google.android.gms.ads.MobileAds

class App: Application() {

    val llamaCpp = LlamaCpp()

    override fun onCreate() {
        super.onCreate()
        llamaCpp.init()
        MobileAds.initialize(this) // P75a
    }
}
