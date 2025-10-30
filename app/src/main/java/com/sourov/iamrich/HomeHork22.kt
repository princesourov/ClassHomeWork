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

        val Users = listOf(
            user("Maisha Juyel", "+880130000001", "https://randomuser.me/api/portraits/women/1.jpg"),
            user("Razia Mannan", "+880130000002", "https://randomuser.me/api/portraits/women/2.jpg"),
            user("Arafat Hossain", "+880130000003", "https://randomuser.me/api/portraits/men/3.jpg"),
            user("Tasin Rahman", "+880130000004", "https://randomuser.me/api/portraits/men/4.jpg"),
            user("Nafisa Ahmed", "+880130000005", "https://randomuser.me/api/portraits/women/5.jpg"),
            user("Sakib Hasan", "+880130000006", "https://randomuser.me/api/portraits/men/6.jpg"),
            user("Sumaiya Noor", "+880130000007", "https://randomuser.me/api/portraits/women/7.jpg"),
            user("Arif Mahmud", "+880130000008", "https://randomuser.me/api/portraits/men/8.jpg"),
            user("Fahmida Akter", "+880130000009", "https://randomuser.me/api/portraits/women/9.jpg"),
            user("Tanvir Alam", "+880130000010", "https://randomuser.me/api/portraits/men/10.jpg"),
            user("Mim Akter", "+880130000011", "https://randomuser.me/api/portraits/women/11.jpg"),
            user("Shuvo Rahman", "+880130000012", "https://randomuser.me/api/portraits/men/12.jpg"),
            user("Tahsin Islam", "+880130000013", "https://randomuser.me/api/portraits/men/13.jpg"),
            user("Ruma Akhter", "+880130000014", "https://randomuser.me/api/portraits/women/14.jpg"),
            user("Rakibul Hasan", "+880130000015", "https://randomuser.me/api/portraits/men/15.jpg"),
            user("Sadia Hossain", "+880130000016", "https://randomuser.me/api/portraits/women/16.jpg"),
            user("Jahidul Islam", "+880130000017", "https://randomuser.me/api/portraits/men/17.jpg"),
            user("Tanjila Rahman", "+880130000018", "https://randomuser.me/api/portraits/women/18.jpg"),
            user("Nayeem Ahsan", "+880130000019", "https://randomuser.me/api/portraits/men/19.jpg"),
            user("Rita Khatun", "+880130000020", "https://randomuser.me/api/portraits/women/20.jpg"),
            user("Emon Chowdhury", "+880130000021", "https://randomuser.me/api/portraits/men/21.jpg"),
            user("Samira Islam", "+880130000022", "https://randomuser.me/api/portraits/women/22.jpg"),
            user("Faisal Mahmud", "+880130000023", "https://randomuser.me/api/portraits/men/23.jpg"),
            user("Nasrin Akter", "+880130000024", "https://randomuser.me/api/portraits/women/24.jpg"),
            user("Hasibul Haque", "+880130000025", "https://randomuser.me/api/portraits/men/25.jpg"),
            user("Nishat Tamanna", "+880130000026", "https://randomuser.me/api/portraits/women/26.jpg"),
            user("Rezaul Karim", "+880130000027", "https://randomuser.me/api/portraits/men/27.jpg"),
            user("Farhana Jahan", "+880130000028", "https://randomuser.me/api/portraits/women/28.jpg"),
            user("Shakil Ahmed", "+880130000029", "https://randomuser.me/api/portraits/men/29.jpg"),
            user("Proma Rahman", "+880130000030", "https://randomuser.me/api/portraits/women/30.jpg"),
            user("Maruf Islam", "+880130000031", "https://randomuser.me/api/portraits/men/31.jpg"),
            user("Rodela Hasan", "+880130000032", "https://randomuser.me/api/portraits/women/32.jpg"),
            user("Naim Chowdhury", "+880130000033", "https://randomuser.me/api/portraits/men/33.jpg"),
            user("Sinthiya Akter", "+880130000034", "https://randomuser.me/api/portraits/women/34.jpg"),
            user("Rahat Hossain", "+880130000035", "https://randomuser.me/api/portraits/men/35.jpg"),
            user("Tuli Akhter", "+880130000036", "https://randomuser.me/api/portraits/women/36.jpg"),
            user("Sabbir Rahman", "+880130000037", "https://randomuser.me/api/portraits/men/37.jpg"),
            user("Lamia Islam", "+880130000038", "https://randomuser.me/api/portraits/women/38.jpg"),
            user("Abir Hasan", "+880130000039", "https://randomuser.me/api/portraits/men/39.jpg"),
            user("Rima Chowdhury", "+880130000040", "https://randomuser.me/api/portraits/women/40.jpg"),
            user("Mizanur Rahman", "+880130000041", "https://randomuser.me/api/portraits/men/41.jpg"),
            user("Tasmia Noor", "+880130000042", "https://randomuser.me/api/portraits/women/42.jpg"),
            user("Imran Kabir", "+880130000043", "https://randomuser.me/api/portraits/men/43.jpg"),
            user("Rifat Akter", "+880130000044", "https://randomuser.me/api/portraits/women/44.jpg"),
            user("Asif Mahmud", "+880130000045", "https://randomuser.me/api/portraits/men/45.jpg"),
            user("Mahira Islam", "+880130000046", "https://randomuser.me/api/portraits/women/46.jpg"),
            user("Nashid Rahman", "+880130000047", "https://randomuser.me/api/portraits/men/47.jpg"),
            user("Puja Akter", "+880130000048", "https://randomuser.me/api/portraits/women/48.jpg"),
            user("Rasel Karim", "+880130000049", "https://randomuser.me/api/portraits/men/49.jpg")
        )


        name_Adapter= Adapter(this,Users)
        binding.recyclerview.layoutManager = LinearLayoutManager(this)
        binding.recyclerview.adapter = name_Adapter
    }
}