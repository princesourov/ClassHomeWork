package com.sourov.iamrich

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

        val nameList = listOf(
            "Sourav", "Razia", "Arafat", "Arisha",
            "Hasan", "Rafi", "Nusrat", "Tuhin", "Sumaiya",
            "Maruf", "Nabila", "Ovi", "Mehedi", "Sadia",
            "Tanvir", "Fahim", "Rumi", "Jannat", "Raju",
            "Shorna", "Mim", "Rakib", "Tania", "Shuvo",
            "Mahin", "Rifat", "Samiha", "Niloy", "Farzana",
            "Sabbir", "Hridoy", "Moumita", "Rubel", "Sathi",
            "Towhid", "Proma", "Kamal", "Sohana", "Rashid",
            "Shakil", "Ayesha", "Imran", "Nadia", "Tahsin",
            "Kawsar", "Afrin", "Sakib", "Priya", "Raihan", "Mahi"
        )

        name_Adapter= Adapter(nameList)
        binding.recyclerview.layoutManager = LinearLayoutManager(this)
        binding.recyclerview.adapter = name_Adapter
    }
}