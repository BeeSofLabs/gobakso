package app.gobakso.com.ui.fragment.common

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import app.beelabs.com.codebase.base.BaseFragment
import app.gobakso.com.databinding.FragmentCommonSearchAddressBinding

class CommonSearchAddressFragment : BaseFragment() {

    private lateinit var binding: FragmentCommonSearchAddressBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCommonSearchAddressBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        with(binding) {
            verifyButton.setOnClickListener { requireActivity().onBackPressed() }
        }
    }
}