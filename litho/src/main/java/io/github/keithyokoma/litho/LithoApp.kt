package io.github.keithyokoma.litho

import android.app.Application
import com.facebook.soloader.SoLoader

/**
 * Created by KeishinYokomaku on 2017/05/27.
 */

class LithoApp : Application() {
    override fun onCreate() {
        super.onCreate()
        SoLoader.init(this, false)
    }
}
