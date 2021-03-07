package app.gobakso.com.ui.activity

import android.os.Bundle
import app.beelabs.com.codebase.base.BaseActivity
import app.gobakso.com.R
import app.gobakso.com.databinding.ActivityRegisterInputBinding

class RegisterInputActivity : BaseActivity() {

    private lateinit var binding: ActivityRegisterInputBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterInputBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initUI()
    }

    private fun initUI() {
        with(binding) {
        }
    }
}