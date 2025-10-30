package com.sourov.iamrich

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import coil.load
import com.sourov.iamrich.databinding.ActivityContactViewBinding

class ContactView : AppCompatActivity() {
    lateinit var binding: ActivityContactViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityContactViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val name = intent.getStringExtra("name")
        val mobile = intent.getStringExtra("mobile")
        val image = intent.getStringExtra("image")

        binding.apply {
            NameTv.text = name
            MobileTv.text = mobile
            ProfileImg.load(image)
        }

    }
}