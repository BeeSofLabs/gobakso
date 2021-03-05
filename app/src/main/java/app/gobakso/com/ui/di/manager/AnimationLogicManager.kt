package app.gobakso.com.ui.di.manager

import android.content.Context
import android.widget.Toast
import app.gobakso.com.ui.di.impl.IAnimationLogic

class AnimationLogicManager : IAnimationLogic {

    override fun setupAnimation(context: Context) {
        Toast.makeText(context, "Show Animation logic", Toast.LENGTH_SHORT).show()
    }
}