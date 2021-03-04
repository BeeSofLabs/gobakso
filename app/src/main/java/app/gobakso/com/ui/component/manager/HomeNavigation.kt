package app.gobakso.com.ui.component.manager

import android.content.Context
import android.content.Intent
import app.gobakso.com.ui.component.impl.IHomeNavigation

class HomeNavigation : IHomeNavigation {
    override fun goSecondPage(txt: String, context: Context) {
        val intent = Intent()
        context.startActivity(intent)
    }

}