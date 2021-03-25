package app.gobakso.com.driver.ui.activity

import android.os.Bundle
import app.beelabs.com.codebase.base.BaseActivity
import app.gobakso.com.driver.databinding.ActivityDriverHomeBinding

class DriverHomeActivity : BaseActivity() {
    private lateinit var binding: ActivityDriverHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDriverHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}