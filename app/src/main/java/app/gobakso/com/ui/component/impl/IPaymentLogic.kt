package app.gobakso.com.ui.component.impl

import android.content.Context
import app.gobakso.com.ui.component.ILogic

interface IPaymentLogic : ILogic {

    fun setupPayment(context: Context)
}