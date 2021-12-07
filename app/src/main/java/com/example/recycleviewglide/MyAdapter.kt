package com.example.recycleviewglide

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.recycleviewglide.models.Store

class MyAdapter(private var array: ArrayList<Store>) :
    RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val productName: TextView = view.findViewById(R.id.productName)
        val image: ImageView = view.findViewById(R.id.im1)
        val price: TextView = view.findViewById(R.id.price)
        val amount: TextView = view.findViewById(R.id.amount)
        val desc: TextView = view.findViewById(R.id.desc)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_product, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val item = array[position]
        holder.productName.text = item.name
        holder.amount.text = "Кол-во: ${item.amount}"
        holder.price.text = "Цена: ${item.price}"
        holder.desc.text = "Описание: ${item.description}"
        Glide.with(holder.itemView)
            .load(item.image)
//            .placeholder(R.drawable.ic_image_not_supported)
            .into(holder.image)

    }

    override fun getItemCount(): Int {
        return array.size
    }
}
