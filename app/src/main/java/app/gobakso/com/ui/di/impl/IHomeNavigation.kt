package app.gobakso.com.ui.di.impl

import android.content.Context
import androidx.navigation.NavController

interface IHomeNavigation : IBaseNavigation {

    fun navigateToHome(context: Context)

    fun navigateToSearchAddress(context: Context)

    fun navigateToProfile(navController: NavController)

    fun navigateToOrder(navController: NavController)

    fun navigateToMapOrder(context: Context)

    fun navigateToCallDriver(context: Context)

    fun navigateToReward(context: Context)
}