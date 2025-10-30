package com.sourov.iamrich

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.sourov.iamrich.databinding.ItemCardBinding

class Adapter(val context: Context, val Users: List<user>) : RecyclerView.Adapter<Adapter.viewholder>() {
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
        holder.binding.apply {
        NameTv.text = Users[position].name
        MobileTv.text = Users[position].mobile
        ProfileImg.load(Users[position].image)
    }
        holder.itemView.setOnClickListener {
            val intent = Intent(context, ContactView::class.java)
            intent.putExtra("name", Users[position].name)
            intent.putExtra("mobile", Users[position].mobile)
            intent.putExtra("image", Users[position].image)
            context.startActivity(intent)
        }

    }

    override fun getItemCount(): Int {
        return Users.size
    }

}