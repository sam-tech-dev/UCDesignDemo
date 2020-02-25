package com.urbanclap.ucdesigndemo

import android.app.Application
import androidx.core.content.res.ResourcesCompat
import com.urbanclap.loki.LokiConfig


class UCDesignDemo : Application() {

    override fun onCreate() {
        super.onCreate()

        LokiConfig {
            setLokiCustomTheme { R.style.LokiCustomTheme }
        }

    }
}