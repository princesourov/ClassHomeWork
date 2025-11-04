package com.sourov.iamrich

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.room.Room
import com.sourov.iamrich.databinding.ActivityHomeHork22Binding

class HomeHork22 : AppCompatActivity() {
    lateinit var binding: ActivityHomeHork22Binding
    lateinit var Dao: UserDao
    lateinit var name_Adapter : Adapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeHork22Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val db = Room.databaseBuilder(
            applicationContext,
            userDataBase::class.java,
            "User_DB"
        ).allowMainThreadQueries().build()

        Dao = db.getUserDao()
        val userList = Dao.getAllUser()


        binding.Addbtn.setOnClickListener {
            val intent = Intent(this, DataAdd::class.java)
            startActivity(intent)
        }
        
        name_Adapter= Adapter(this,userList)
        binding.recyclerview.layoutManager = LinearLayoutManager(this)
        binding.recyclerview.adapter = name_Adapter
    }
}