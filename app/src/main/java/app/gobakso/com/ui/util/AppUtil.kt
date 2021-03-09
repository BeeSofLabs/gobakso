package app.gobakso.com.ui.util

import android.view.View
import android.view.Window

object AppUtil {

    fun setupLightStatusBarMode(window: Window) {
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
    }
}