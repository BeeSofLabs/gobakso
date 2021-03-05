package app.gobakso.com.ui.di.impl

import android.content.Context

interface IHomeNavigation : IBaseNavigation {

    fun goSecondPage(txt: String, context: Context)
}