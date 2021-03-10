package app.gobakso.com.ui.activity

import android.os.Bundle
import app.beelabs.com.codebase.base.BaseActivity
import app.gobakso.com.App
import app.gobakso.com.databinding.ActivityLoginBinding
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : BaseActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initUI()
    }

    private fun initUI() {
        with(binding) {
            signinButton.setOnClickListener {
                App.getNavigationComponent().homeNavigation()
                    .navigateToHome(this@LoginActivity)
            }
            signupButton.setOnClickListener {
                App.getNavigationComponent().authNavigation(intent)
                    .navigateToSignupInput(this@LoginActivity)
            }
        }
    }
}