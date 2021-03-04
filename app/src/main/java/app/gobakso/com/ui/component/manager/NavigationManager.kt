package app.gobakso.com.ui.component.manager

import android.content.Intent
import app.gobakso.com.App
import app.gobakso.com.ui.component.impl.IHomeNavigation
import app.gobakso.com.ui.component.impl.INavigation

class NavigationManager : INavigation {
    override fun homeNavigation(intent: Intent): IHomeNavigation {
        return App.uiComponent?.inject(HomeNavigation())!!
    }
}