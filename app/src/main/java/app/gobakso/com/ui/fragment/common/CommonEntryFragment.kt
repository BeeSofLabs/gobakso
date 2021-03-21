package app.gobakso.com.ui.fragment.common

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.NavController
import androidx.navigation.Navigation
import app.beelabs.com.codebase.base.BaseFragment
import app.gobakso.com.R
import app.gobakso.com.databinding.FragmentCommonEntryBinding

class CommonEntryFragment : BaseFragment() {
    lateinit var navController: NavController
    private lateinit var binding: FragmentCommonEntryBinding


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCommonEntryBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)

        Toast.makeText(activity, "Search", Toast.LENGTH_SHORT).show()
//        goToPinEntry()
        goToSearchAddress()
    }

    private fun goToPinEntry() {
        navController.navigate(R.id.action_commonEntryFragment_to_commonPinEntryFragment)
    }

    private fun goToSearchAddress() {
        navController.navigate(R.id.action_commonEntryFragment_to_commonSearchAddressFragment)
    }
}