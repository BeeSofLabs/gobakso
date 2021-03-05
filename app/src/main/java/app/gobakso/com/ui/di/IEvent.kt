package app.gobakso.com.ui.di

import android.content.Context
import android.widget.TextView

interface IEvent {
    fun setupEvent(context: Context)

    fun showLabelManager(label: String, labelTextView: TextView, context: Context)
}