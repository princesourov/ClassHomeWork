package com.sourov.iamrich

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.sourov.iamrich.databinding.ActivityMain4Binding


class MainActivity4 : AppCompatActivity() {
    lateinit var biddings: ActivityMain4Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        biddings = ActivityMain4Binding.inflate(layoutInflater)
        setContentView(biddings.root)

        biddings.hmw12.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        biddings.hmw13.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
        biddings.hmw130.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }
        biddings.hmw14.setOnClickListener {
            val intent = Intent(this, MainActivity5::class.java)
            startActivity(intent)
        }
    }
}
