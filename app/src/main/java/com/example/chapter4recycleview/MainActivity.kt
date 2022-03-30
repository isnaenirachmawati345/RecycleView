package com.example.chapter4recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.chapter4recycleview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        //untuk panggil binding
        setContentView(binding.root)

        val listContact = arrayListOf(
            Contact ("Tahu Aci", "08976584724", R.drawable.tahu),
            Contact ("Tahu Aci", "08976584724", R.drawable.combro),
            Contact ("Tahu Aci", "08976584724", R.drawable.dimsum),
            Contact ("Tahu Aci", "08976584724", R.drawable.sumedang),
            Contact ("Tahu Aci", "08976584724", R.drawable.walik),
            Contact ("Tahu Aci", "08976584724", R.drawable.bakso),
            )
        val adapter = ContactAdapter(listContact)
         val layoutManager = GridLayoutManager(this, 2 )
         binding.tvMain.layoutManager = layoutManager

        binding.tvMain.adapter = adapter
    }
}