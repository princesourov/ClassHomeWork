package com.sourov.iamrich

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.sourov.iamrich.databinding.ActivityHomeHork22Binding

class HomeHork22 : AppCompatActivity() {
    lateinit var binding: ActivityHomeHork22Binding
    lateinit var name_Adapter : Adapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeHork22Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.Addbtn.setOnClickListener {
            val intent = Intent(this, DataAdd::class.java)
            startActivity(intent)
        }

        val Users = listOf(
            user(0,"Arisha", "+880130000001", "https://randomuser.me/api/portraits/women/1.jpg"),

        )


        name_Adapter= Adapter(this,Users)
        binding.recyclerview.layoutManager = LinearLayoutManager(this)
        binding.recyclerview.adapter = name_Adapter
    }
}