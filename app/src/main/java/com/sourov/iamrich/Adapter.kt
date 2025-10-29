package com.sourov.iamrich

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sourov.iamrich.databinding.ItemCardBinding

class Adapter(private val personList: List<String>) : RecyclerView.Adapter<Adapter.viewholder>() {
    class viewholder(val binding: ItemCardBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): viewholder {
        val binding = ItemCardBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return viewholder(binding)
    }

    override fun onBindViewHolder(
        holder: viewholder,
        position: Int
    ) {
        holder.binding.NameTv.text = personList[position]
    }

    override fun getItemCount(): Int {
        return personList.size
    }

}