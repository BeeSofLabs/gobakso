package app.gobakso.com.ui.activity

import android.os.Bundle
import androidx.viewbinding.ViewBinding
import app.beelabs.com.codebase.base.BaseActivity
import app.gobakso.com.R
import app.gobakso.com.databinding.ActivityLoginBinding

class LoginActivity : BaseActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val binding = ActivityLoginBinding.inflate(layoutInflater)

        initUI(binding)
    }

    private fun initUI(binding: ViewBinding){
        with(binding){

        }

    }
}