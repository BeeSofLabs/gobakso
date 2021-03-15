package app.gobakso.com.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import app.gobakso.com.databinding.ItemDriverBinding

class DriverAdapter : RecyclerView.Adapter<DriverAdapter.DriverViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DriverViewHolder {
        val itemBinding =
            ItemDriverBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return DriverViewHolder(itemBinding)
    }

    override fun getItemCount(): Int = 10

    override fun onBindViewHolder(holder: DriverViewHolder, position: Int) {

    }

    class DriverViewHolder(private val itemDriver: ItemDriverBinding) :
        RecyclerView.ViewHolder(itemDriver.root) {
        fun bind(position: Int) {

        }
    }

}