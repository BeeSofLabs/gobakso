package app.gobakso.com.ui.component.manager

import android.content.Context
import android.widget.TextView
import android.widget.Toast
import app.gobakso.com.ui.component.IEvent

class EventManager : IEvent {
    override fun showLabelManager(label: String, labelTextView: TextView, context: Context) {
        labelTextView.text = label
    }

    override fun setupEvent(context: Context) {
        Toast.makeText(context, "Show Event", Toast.LENGTH_SHORT).show()
    }
}