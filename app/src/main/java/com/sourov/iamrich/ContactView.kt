package com.sourov.iamrich

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import coil.load
import com.sourov.iamrich.databinding.ActivityContactViewBinding
import androidx.core.net.toUri

class ContactView : AppCompatActivity() {
    lateinit var binding: ActivityContactViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityContactViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val name = intent.getStringExtra("name")
        val mobile = intent.getStringExtra("mobile")
        val image = intent.getStringExtra("image")
        val color = intent.getIntExtra("color", android.graphics.Color.GRAY)

        binding.apply {
            NameTv.text = name
            MobileTv.text = mobile

            if (image!!.startsWith("http")) {
                ProfileImg.visibility = View.VISIBLE
                AvatarText.visibility = View.GONE
                ProfileImg.load(image)
            } else {
                ProfileImg.visibility = View.GONE
                AvatarText.visibility = View.VISIBLE
                AvatarText.text = image.uppercase()
                AvatarText.background.setTint(color)
            }
            callIC.setOnClickListener {
                val phoneNumber = binding.MobileTv.text.toString()
                val intent = Intent(Intent.ACTION_DIAL)
                intent.data = "tel:$phoneNumber".toUri()
                startActivity(intent)
            }
            smsIC.setOnClickListener {
                val phoneNumber = binding.MobileTv.text.toString()
                val url = "https://wa.me/$phoneNumber"
                val intent = Intent(Intent.ACTION_VIEW)
                intent.data = url.toUri()
                startActivity(intent)
            }

            }
        }
    }
