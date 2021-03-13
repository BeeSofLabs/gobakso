package app.gobakso.com.ui.fragment.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import app.beelabs.com.codebase.base.BaseActivity
import app.beelabs.com.codebase.base.BaseFragment
import app.gobakso.com.App
import app.gobakso.com.databinding.FragmentFoodOrderBinding
import app.gobakso.com.ui.adapter.ProductOrderAdapter

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
            listProduct.hasFixedSize()
            listProduct.layoutManager = LinearLayoutManager(context)
            listProduct.adapter = ProductOrderAdapter(null)

            nextButton.setOnClickListener {
                App.getNavigationComponent().homeNavigation().navigateToMapOrder(activity as BaseActivity)
            }
        }
    }

}