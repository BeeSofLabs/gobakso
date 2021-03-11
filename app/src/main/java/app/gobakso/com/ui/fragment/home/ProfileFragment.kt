package app.gobakso.com.ui.fragment.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import app.beelabs.com.codebase.base.BaseFragment
import app.gobakso.com.databinding.FragmentCommonPinEntryBinding
import app.gobakso.com.databinding.FragmentProfileBinding

class ProfileFragment : BaseFragment() {
    private var _binding: FragmentProfileBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentProfileBinding.inflate(inflater, container, false)
        binding.profileBackButton.buttonBack.setOnClickListener { activity?.onBackPressed() }
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        with(binding){
//            profileBackButton.buttonBack.setOnClickListener { activity?.onBackPressed() }
        }
    }
}