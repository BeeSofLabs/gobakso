package app.gobakso.com.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import app.gobakso.com.databinding.ItemProductBinding
import app.gobakso.com.databinding.ItemProductOrderBinding
import app.gobakso.com.model.data.entity.Product

class ProductOrderAdapter(private val productOrders: ArrayList<Product>?) :
    RecyclerView.Adapter<ProductOrderAdapter.ProductViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val itemProductOrderBinding =
            ItemProductOrderBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ProductViewHolder(itemProductOrderBinding)
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        holder.bind(position)

    }

    override fun getItemCount(): Int = 10

    class ProductViewHolder(private val itemProductOrder: ItemProductOrderBinding) :
        RecyclerView.ViewHolder(itemProductOrder.root) {

        fun bind(position: Int) {
//            itemProductOrder.itemTitle.text = ""+(position+1)
            itemProductOrder.buttonPlus.setOnClickListener { plusQuantity(itemProductOrder.itemQty) }
            itemProductOrder.buttonMinus.setOnClickListener { minusQuantity(itemProductOrder.itemQty) }
        }

        private fun plusQuantity(itemQty: TextView){
            if(itemQty.text.toString().toInt() == 5) return
            itemQty.text = ""+itemQty.text.toString().toInt().plus(1)
        }

        private fun minusQuantity(itemQty: TextView){
            if(itemQty.text.toString().toInt() == 0) return
            itemQty.text = ""+itemQty.text.toString().toInt().minus(1)
        }
    }
}