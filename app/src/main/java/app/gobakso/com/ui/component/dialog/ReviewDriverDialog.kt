package app.gobakso.com.ui.component.dialog

import android.os.Bundle
import android.widget.Toast
import app.beelabs.com.codebase.base.BaseActivity
import app.beelabs.com.codebase.base.BaseDialog
import app.gobakso.com.databinding.DialogReviewDriverBinding
import app.gobakso.com.ui.activity.MapOrderActivity

class ReviewDriverDialog(_activity: BaseActivity, style: Int) : BaseDialog(_activity, style) {

    val activity: BaseActivity = _activity
    private lateinit var binding: DialogReviewDriverBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DialogReviewDriverBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            closeRatingDialog.setOnClickListener {
                dismiss()
                if (activity is MapOrderActivity) activity.afterRatingCallback()


            }
            reviewRatingStar.setOnRatingChangeListener { ratingBar, preCount, curCount ->
                Toast.makeText(context, "Rating = $curCount", Toast.LENGTH_SHORT).show()
            }
        }
    }
}