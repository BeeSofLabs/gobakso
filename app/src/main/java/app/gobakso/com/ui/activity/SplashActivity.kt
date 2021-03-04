package app.gobakso.com.ui.activity

import android.content.Intent
import android.os.Bundle
import app.beelabs.com.codebase.base.BaseActivity
import app.beelabs.com.codebase.support.rx.RxTimer
import app.gobakso.com.R

import kotlinx.android.synthetic.main.activity_splash.*

class SplashActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val splashIntent = Intent(SplashscreenActivity@this, MainActivity::class.java)
        RxTimer.doTimer(5000, false, object : RxTimer() {
            override fun onCallback(along: Long?) {
                startActivity(splashIntent)
                finish()
            }
        })
    }
}