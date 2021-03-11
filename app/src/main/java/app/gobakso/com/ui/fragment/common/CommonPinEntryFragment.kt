package app.gobakso.com.ui.fragment.common

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import app.beelabs.com.codebase.base.BaseActivity
import app.beelabs.com.codebase.base.BaseFragment
import app.gobakso.com.R
import app.gobakso.com.databinding.FragmentCommonPinEntryBinding

class CommonPinEntryFragment : BaseFragment() {
    private lateinit var binding: FragmentCommonPinEntryBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCommonPinEntryBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        with(binding){
            verifyButton.setOnClickListener { requireActivity().onBackPressed() }
        }
    }
}