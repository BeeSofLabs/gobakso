package app.gobakso.com.ui.di.manager

import android.content.Intent
import app.gobakso.com.App
import app.gobakso.com.ui.di.impl.IAuthNavigation
import app.gobakso.com.ui.di.impl.IHomeNavigation
import app.gobakso.com.ui.di.impl.INavigation
import app.gobakso.com.ui.di.navigation.AuthNavigation
import app.gobakso.com.ui.di.navigation.HomeNavigation

class NavigationManager : INavigation {
    override fun homeNavigation(): IHomeNavigation {
        return App.uiComponent?.inject(HomeNavigation())!!
    }

    override fun authNavigation(intent: Intent): IAuthNavigation {
        return App.uiComponent?.inject(AuthNavigation())!!
    }
}