package com.sourov.iamrich

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.sourov.iamrich.databinding.ActivityMain6Binding

class MainActivity6 : AppCompatActivity() {
    lateinit var binding: ActivityMain6Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain6Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val name = intent.getStringExtra("name")
        val email = intent.getStringExtra("email")
        val phone = intent.getStringExtra("phone")

        binding.apply {
            Txname.text = "Name: $name"
            Txemail.text = "Email: $email"
            Txphone.text = "Phone: $phone"
        }

    }
}