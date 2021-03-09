package app.gobakso.com.ui.activity

import android.content.Intent
import android.os.Bundle
import app.beelabs.com.codebase.base.BaseActivity
import app.beelabs.com.codebase.support.rx.RxTimer
import app.gobakso.com.R
import app.gobakso.com.model.data.api.response.SourceResponse
import app.gobakso.com.presenter.AuthPresenter
import app.gobakso.com.ui.ISplashView
import app.gobakso.com.ui.util.AppUtil

import kotlinx.android.synthetic.main.activity_splash.*

class SplashActivity : BaseActivity(), ISplashView {

    private val authPresenter = AuthPresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        AppUtil.setupLightStatusBarMode(window)

        val splashIntent = if (authPresenter.getAuthLoginStatus(this))
            Intent(SplashscreenActivity@ this, MainActivity::class.java)
        else Intent(SplashscreenActivity@ this, LoginActivity::class.java)

        RxTimer.doTimer(5000, false, object : RxTimer() {
            override fun onCallback(along: Long?) {
                startActivity(splashIntent)
                finish()
            }
        })
    }

    override fun handleProcessing() {
        TODO("Not yet implemented")
    }

    override fun handleDataSource(model: SourceResponse?) {
        TODO("Not yet implemented")
    }
}