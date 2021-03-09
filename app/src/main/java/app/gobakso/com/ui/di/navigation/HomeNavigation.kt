package app.gobakso.com.ui.di.navigation

import android.content.Context
import android.content.Intent
import app.gobakso.com.ui.activity.MainActivity
import app.gobakso.com.ui.di.impl.IHomeNavigation

class HomeNavigation : IHomeNavigation {
    override fun navigateToHome(context: Context) {
        context.startActivity(Intent(context, MainActivity::class.java))
    }

}