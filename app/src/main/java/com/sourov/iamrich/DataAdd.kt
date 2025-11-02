package com.sourov.iamrich

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.room.Room
import com.sourov.iamrich.databinding.ActivityDataAddBinding

class DataAdd : AppCompatActivity() {
    lateinit var binding: ActivityDataAddBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityDataAddBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val db = Room.databaseBuilder(
            applicationContext,
            userDataBase::class.java,
            "User_DB"
        ).allowMainThreadQueries().build()

        val dao = db.getUserDao()


        binding.savebtn.setOnClickListener {
            val contactname =binding.Etname.text.toString().trim()
            val number =binding.Etnumbr.text.toString().trim()
            if (contactname.isEmpty() || number.isEmpty()){
                Toast.makeText(this,"Enter name & Number ", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            val contact = user(0,contactname,number,"https://randomuser.me/api/portraits/women/1.jpg")
            dao.addUser(contact)
            Toast.makeText(this, "Contact Saved ", Toast.LENGTH_SHORT).show()
            finish()
        }

    }
}