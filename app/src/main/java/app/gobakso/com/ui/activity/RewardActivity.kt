package app.gobakso.com.ui.activity

import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import app.beelabs.com.codebase.base.BaseActivity
import app.gobakso.com.databinding.ActivityCallDriverBinding
import app.gobakso.com.databinding.ActivityRewardBinding
import app.gobakso.com.ui.adapter.DriverAdapter
import app.gobakso.com.ui.adapter.RewardAdapter

class RewardActivity : BaseActivity() {
    private lateinit var binding: ActivityRewardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRewardBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initUI()
    }

    private fun initUI() = with(binding){
        rvRewards.hasFixedSize()
        rvRewards.layoutManager = LinearLayoutManager(this@RewardActivity)
        rvRewards.adapter = RewardAdapter()
    }
}