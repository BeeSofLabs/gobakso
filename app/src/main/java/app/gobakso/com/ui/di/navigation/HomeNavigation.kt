package app.gobakso.com.ui.di.navigation

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.navigation.NavController
import app.gobakso.com.R
import app.gobakso.com.ui.activity.CallDriveActivity
import app.gobakso.com.ui.activity.MainActivity
import app.gobakso.com.ui.activity.MapOrderActivity
import app.gobakso.com.ui.activity.RewardActivity
import app.gobakso.com.ui.di.impl.IHomeNavigation

class HomeNavigation : IHomeNavigation {

    override fun navigateToHome(context: Context) {
        context.startActivity(Intent(context, MainActivity::class.java))
        (context as Activity).finish()
    }

    override fun navigateToProfile(navController: NavController) {
        navController.navigate(R.id.action_homeFragment_to_profileFragment)
    }

    override fun navigateToOrder(navController: NavController) {
        navController.navigate(R.id.action_homeFragment_to_orderMapFragment)
    }

    override fun navigateToMapOrder(context: Context) {
        context.startActivity(Intent(context, MapOrderActivity::class.java))
    }

    override fun navigateToCallDriver(context: Context) {
        context.startActivity(Intent(context, CallDriveActivity::class.java))
    }

    override fun navigateToReward(context: Context) {
        context.startActivity(Intent(context, RewardActivity::class.java))
    }
}