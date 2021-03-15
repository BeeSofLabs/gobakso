package app.gobakso.com.ui.activity

import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import app.beelabs.com.codebase.base.BaseActivity
import app.gobakso.com.databinding.ActivityCallDriverBinding
import app.gobakso.com.ui.adapter.DriverAdapter

class CallDriveActivity : BaseActivity() {
    private lateinit var binding: ActivityCallDriverBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCallDriverBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initUI()
    }

    private fun initUI() = with(binding){
        rvDrivers.hasFixedSize()
        rvDrivers.layoutManager = LinearLayoutManager(this@CallDriveActivity)
        rvDrivers.adapter = DriverAdapter()
    }
}