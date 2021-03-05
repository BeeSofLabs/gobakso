package app.gobakso.com.ui.di.impl

import android.content.Context
import app.gobakso.com.ui.di.ILogic

interface IAnimationLogic : ILogic {

    fun setupAnimation(context: Context)
}