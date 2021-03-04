package app.gobakso.com.ui.dialog

import android.content.Context
import android.os.Bundle
import app.beelabs.com.codebase.base.BaseDialog
import app.gobakso.com.R

class MainDialog(context: Context, style: Int) : BaseDialog(context, style) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dialog_main)
    }
}