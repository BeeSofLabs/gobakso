package app.gobakso.com.ui.di.manager

import android.content.Intent
import app.gobakso.com.App
import app.gobakso.com.ui.di.impl.IHomeNavigation
import app.gobakso.com.ui.di.impl.INavigation

class NavigationManager : INavigation {
    override fun homeNavigation(intent: Intent): IHomeNavigation {
        return App.uiComponent?.inject(HomeNavigation())!!
    }
}