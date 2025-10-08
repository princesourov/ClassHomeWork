package com.sourov.iamrich

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.sourov.iamrich.databinding.ActivityMain5Binding

class MainActivity5 : AppCompatActivity() {
    lateinit var binding: ActivityMain5Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain5Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            var name = binding.Etname.text.toString().trim()
            var email = binding.Etmail.text.toString().trim()
            var phone = binding.Etphon.text.toString().trim()

            val intent = Intent(this, MainActivity6::class.java)
            intent.putExtra("name",name)
            intent.putExtra("email",email)
            intent.putExtra("phone",phone)
            startActivity(intent)
        }
    }
}