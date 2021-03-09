package app.gobakso.com.ui.fragment.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import app.beelabs.com.codebase.base.BaseFragment
import app.beelabs.com.mopay.ui.fragment.onboard.BannerFirstFragment
import app.beelabs.com.mopay.ui.fragment.onboard.BannerThirdFragment
import app.gobakso.com.databinding.FragmentHomeBinding
import app.gobakso.com.ui.adapter.BannerViewPagerAdapter
import app.gobakso.com.ui.fragment.banner.BannerSecondFragment
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : BaseFragment() {
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
    }

    private fun setupViewPager() : ViewPager {
        val adapter = BannerViewPagerAdapter(fragmentManager)

        fragments.add(BannerFirstFragment())
        fragments.add(BannerSecondFragment())
        fragments.add(BannerThirdFragment())

        adapter.addFragments(fragments)
        viewPager.adapter = adapter

        return viewPager
    }
}