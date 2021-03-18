package app.gobakso.com.ui.component.dialog

import android.content.Context
import android.os.Bundle
import app.gobakso.com.R
import com.google.android.material.bottomsheet.BottomSheetDialog

class OrderBottomSheetDialog(context: Context) : BottomSheetDialog(context) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.content_order_bottom_sheet_dialog)
    }
}