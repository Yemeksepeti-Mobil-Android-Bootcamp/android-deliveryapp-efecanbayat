package com.efecanbayat.deliveryapp.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.efecanbayat.deliveryapp.data.entity.Category
import com.efecanbayat.deliveryapp.databinding.ItemCategoryBinding

class CategoriesAdapter: RecyclerView.Adapter<CategoriesAdapter.CategoriesViewHolder>() {

    private var list = ArrayList<Category>()

    inner class CategoriesViewHolder(val binding: ItemCategoryBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoriesViewHolder {
        val binding = ItemCategoryBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return CategoriesViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CategoriesViewHolder, position: Int) {
        val item = list[position]

        Glide.with(holder.binding.categoryImageView.context)
            .load(item.categoryImage).into(holder.binding.categoryImageView)

        holder.binding.categoryNameTextView.text = item.categoryName
    }

    override fun getItemCount(): Int {
        return list.size
    }

    fun setCategoryList(list: List<Category>){
        this.list = ArrayList(list)
        notifyDataSetChanged()
    }
}