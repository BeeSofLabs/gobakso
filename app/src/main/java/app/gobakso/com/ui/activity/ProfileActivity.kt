package app.gobakso.com.ui.activity

import android.os.Bundle
import app.beelabs.com.codebase.base.BaseActivity
import app.gobakso.com.databinding.ActivityProfileBinding

class ProfileActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initUI()
    }

    private fun initUI() {

    }
}