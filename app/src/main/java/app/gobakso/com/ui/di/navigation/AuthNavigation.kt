package app.gobakso.com.ui.di.navigation

import android.content.Context
import android.content.Intent
import android.widget.Toast
import app.gobakso.com.ui.activity.RegisterInputActivity
import app.gobakso.com.ui.di.impl.IAuthNavigation

class AuthNavigation : IAuthNavigation {

    override fun navigateToSignupInput(context: Context) =
        context.startActivity(Intent(context, RegisterInputActivity::class.java))
}