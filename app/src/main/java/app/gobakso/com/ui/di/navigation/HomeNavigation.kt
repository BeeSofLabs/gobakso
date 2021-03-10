package app.gobakso.com.ui.di.navigation

import android.content.Context
import android.content.Intent
import androidx.navigation.NavController
import app.gobakso.com.R
import app.gobakso.com.ui.activity.MainActivity
import app.gobakso.com.ui.di.impl.IHomeNavigation

class HomeNavigation : IHomeNavigation {

    override fun navigateToHome(context: Context) {
        context.startActivity(Intent(context, MainActivity::class.java))
    }

    override fun navigateToProfile(navController: NavController) {
        navController.navigate(R.id.action_homeFragment_to_profileFragment)
    }
}