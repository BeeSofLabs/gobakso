package app.gobakso.com.ui.activity

import android.os.Bundle
import android.widget.Toast
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import app.beelabs.com.codebase.base.BaseActivity
import app.gobakso.com.R
import app.gobakso.com.databinding.ActivityCommonBinding
import app.gobakso.com.ui.fragment.common.CommonEntryFragment
import kotlinx.android.synthetic.main.activity_common.view.*

class CommonActivity : BaseActivity() {

    private lateinit var binding: ActivityCommonBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCommonBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}