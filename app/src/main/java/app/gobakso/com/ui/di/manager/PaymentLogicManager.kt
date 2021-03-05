package app.gobakso.com.ui.di.manager

import android.content.Context
import android.widget.Toast
import app.gobakso.com.ui.di.impl.IPaymentLogic

class PaymentLogicManager : IPaymentLogic {

    override fun setupPayment(context: Context) {
        Toast.makeText(context, "Show Payment logic", Toast.LENGTH_SHORT).show()
    }
}