package app.gobakso.com.ui.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class BannerViewPagerAdapter(fm: FragmentManager?) : FragmentStatePagerAdapter(fm!!) {

    var fragments = ArrayList<Fragment>()

    fun addFragments(fragments: ArrayList<Fragment>) {
        this.fragments = fragments
    }

    override fun getItem(position: Int): Fragment {
        return fragments[position]
    }

    override fun getCount(): Int {
        return fragments.size
    }
}