package app.gobakso.com.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import app.gobakso.com.databinding.ItemProductBinding
import app.gobakso.com.model.data.entity.Product

class ProductListAdapter(private val products: ArrayList<Product>) :
    RecyclerView.Adapter<ProductListAdapter.ProductViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val itemBinding =
            ItemProductBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ProductViewHolder(itemBinding)
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        holder.bind(position)

    }

    override fun getItemCount(): Int = 20

    class ProductViewHolder(private val itemProduct: ItemProductBinding) :
        RecyclerView.ViewHolder(itemProduct.root) {

        fun bind(position: Int) {
            itemProduct.itemLabel.text = ""+(position + 1)
        }
    }
}