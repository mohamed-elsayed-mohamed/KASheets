package com.alpha.kasheets.view.bottomsheets.pizzasheet

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.alpha.kasheets.databinding.ItemPizzaBinding
import com.alpha.kasheets.model.Pizza
import com.bumptech.glide.Glide

class PizzaAdapter(val pizzaList: ArrayList<Pizza>) :
    RecyclerView.Adapter<PizzaAdapter.PizzaViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PizzaViewHolder {
        return PizzaViewHolder(
            ItemPizzaBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun onBindViewHolder(holder: PizzaViewHolder, position: Int) =
        holder.bind(pizzaList[position])

    override fun getItemCount() = pizzaList.size

    inner class PizzaViewHolder(private val binding: ItemPizzaBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(pizza: Pizza) {
            Glide.with(binding.root)
                .load(pizza.imageUrl)
                .into(binding.imgPizza)
            binding.pizza = pizza
        }
    }
}