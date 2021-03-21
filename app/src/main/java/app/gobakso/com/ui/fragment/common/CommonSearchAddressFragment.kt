package app.gobakso.com.ui.fragment.common

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import app.beelabs.com.codebase.base.BaseFragment
import app.gobakso.com.IConfig
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
            inputSearch.setOnTouchListener(object : View.OnTouchListener {
                @SuppressLint("ClickableViewAccessibility")
                override fun onTouch(v: View?, event: MotionEvent?): Boolean {
                    val DRAWABLE_RIGHT: Int = 2;

                    if (event?.action == MotionEvent.ACTION_UP) {
                        if (event?.rawX >= (inputSearch.right - inputSearch.compoundDrawables[DRAWABLE_RIGHT].bounds.width() - IConfig.SEARCH_BOUNDS_RIGHT_OFFSET)) {

                            inputSearch.setText("")
                            return true
                        }
                    }
                    return false
                }
            })
        }
    }
}