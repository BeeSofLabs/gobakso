package app.gobakso.com.ui.di.impl

import android.content.Intent

interface INavigation : IBaseNavigation {
    fun homeNavigation(): IHomeNavigation
    fun authNavigation(intent: Intent): IAuthNavigation
}