package app.gobakso.com.ui.activity

import android.os.Bundle
import android.widget.Toast
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
            signupButton.setOnClickListener {
                App.getNavigationComponent().authNavigation(intent)
                    .navigateToSignupInput(this@LoginActivity)
            }
        }
    }
}