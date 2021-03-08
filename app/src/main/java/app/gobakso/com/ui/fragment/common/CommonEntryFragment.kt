package app.gobakso.com.ui.fragment.common

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import app.beelabs.com.codebase.base.BaseActivity
import app.beelabs.com.codebase.base.BaseFragment
import app.gobakso.com.R
import app.gobakso.com.databinding.FragmentCommonEntryBinding

class CommonEntryFragment : BaseFragment() {
    lateinit var navController: NavController

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)

        goToPinEntry()
    }

    private fun goToPinEntry() {
        navController.navigate(R.id.action_commonEntryFragment_to_commonPinEntryFragment)
    }
}