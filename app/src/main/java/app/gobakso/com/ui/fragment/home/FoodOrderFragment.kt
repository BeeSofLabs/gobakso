package app.gobakso.com.ui.fragment.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import app.beelabs.com.codebase.base.BaseActivity
import app.beelabs.com.codebase.base.BaseFragment
import app.gobakso.com.App
import app.gobakso.com.databinding.FragmentFoodOrderBinding

class FoodOrderFragment : BaseFragment() {

    private lateinit var binding: FragmentFoodOrderBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFoodOrderBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initUI()
    }

    private fun initUI() {
        with(binding) {
            nextButton.setOnClickListener {
                App.getNavigationComponent().homeNavigation().navigateToMapOrder(activity as BaseActivity)
            }
        }
    }

}