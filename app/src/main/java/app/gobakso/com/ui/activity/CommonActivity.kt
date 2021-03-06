package app.gobakso.com.ui.activity

import android.os.Bundle
import app.beelabs.com.codebase.base.BaseActivity
import app.gobakso.com.databinding.ActivityCommonBinding

class CommonActivity : BaseActivity() {

    private lateinit var binding: ActivityCommonBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCommonBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}