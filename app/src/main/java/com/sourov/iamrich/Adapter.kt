package com.sourov.iamrich

import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.sourov.iamrich.databinding.ItemCardBinding
import androidx.core.graphics.toColorInt

class Adapter(val context: Context, val Users: List<user>) :
    RecyclerView.Adapter<Adapter.viewholder>() {

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
        val user = Users[position]

        holder.binding.apply {
            NameTv.text = user.name
            MobileTv.text = user.mobile

            // Color list
            val colors = listOf(
                "#F44336","#E91E63","#9C27B0","#673AB7","#3F51B5",
                "#2196F3","#03A9F4","#00BCD4","#009688","#4CAF50",
                "#8BC34A","#FFC107","#FF9800","#FF5722"
            )

            if (user.image.startsWith("http")) {
                // Real image
                ProfileImg.visibility = View.VISIBLE
                AvatarText.visibility = View.GONE
                ProfileImg.load(user.image)
            } else {
                // Letter avatar
                ProfileImg.visibility = View.GONE
                AvatarText.visibility = View.VISIBLE
                AvatarText.text = user.image.uppercase()

                // Deterministic color
                val firstLetter = user.image.first().uppercaseChar()
                val colorIndex = (firstLetter.code % colors.size)
                val avatarColor = colors[colorIndex].toColorInt()
                AvatarText.background.setTint(avatarColor)
            }
        }

        holder.itemView.setOnClickListener {
            val firstLetter = user.image.first().uppercaseChar()
            val colors = listOf(
                "#F44336","#E91E63","#9C27B0","#673AB7","#3F51B5",
                "#2196F3","#03A9F4","#00BCD4","#009688","#4CAF50",
                "#8BC34A","#FFC107","#FF9800","#FF5722"
            )
            val colorIndex = (firstLetter.code % colors.size)
            val avatarColor = colors[colorIndex].toColorInt()

            val intent = Intent(context, ContactView::class.java)
            intent.putExtra("name", user.name)
            intent.putExtra("mobile", user.mobile)
            intent.putExtra("image", user.image)
            intent.putExtra("color", avatarColor)
            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int = Users.size
}
