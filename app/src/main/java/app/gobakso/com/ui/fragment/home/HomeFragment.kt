package app.gobakso.com.ui.fragment.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.viewpager.widget.ViewPager
import app.beelabs.com.codebase.base.BaseFragment
import app.gobakso.com.App
import app.gobakso.com.databinding.FragmentHomeBinding
import app.gobakso.com.model.data.entity.Product
import app.gobakso.com.ui.adapter.BannerViewPagerAdapter
import app.gobakso.com.ui.adapter.ProductListAdapter
import app.gobakso.com.ui.fragment.banner.BannerFirstFragment
import app.gobakso.com.ui.fragment.banner.BannerSecondFragment
import app.gobakso.com.ui.fragment.banner.BannerThirdFragment
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : BaseFragment() {
    private lateinit var navController: NavController
    private var currentPage = 0
    private lateinit var binding: FragmentHomeBinding
    private val fragments = ArrayList<Fragment>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        setupViewPager().addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageScrollStateChanged(state: Int) {
            }

            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {
            }

            override fun onPageSelected(position: Int) {
                currentPage = position
            }
        })

        initUI()
    }

    private fun initUI() {
        setupProductList()
        with(binding) {
            profileButton.setOnClickListener {
                App.getNavigationComponent().homeNavigation().navigateToProfile(navController)
            }
            foodOrderButton.setOnClickListener {
                App.getNavigationComponent().homeNavigation().navigateToOrder(navController)
            }

            callOrderButton.setOnClickListener {
                App.getNavigationComponent().homeNavigation().navigateToCallDriver(requireContext())
            }
            rewardButton.setOnClickListener {
                App.getNavigationComponent().homeNavigation().navigateToReward(requireContext())
            }
        }
    }

    private fun setupProductList() {
        with(binding) {
            productList.setItemViewCacheSize(10)
            productList.hasFixedSize()
            productList.apply {
                layoutManager = LinearLayoutManager(context)
                adapter = ProductListAdapter(ArrayList<Product>())
            }
        }
    }

    private fun setupViewPager(): ViewPager {
        val adapter = BannerViewPagerAdapter(fragmentManager)

        fragments.add(BannerFirstFragment())
        fragments.add(BannerSecondFragment())
        fragments.add(BannerThirdFragment())

        adapter.addFragments(fragments)
        viewPager.adapter = adapter

        return viewPager
    }

    override fun onResume() {
        super.onResume()
        initUI()
    }
}