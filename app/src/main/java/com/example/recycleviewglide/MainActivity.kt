package com.example.recycleviewglide

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import com.example.recycleviewglide.models.Store

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView

    val products = arrayListOf(
        Store("Milk","https://raw.githubusercontent.com/adizqx/calc/main/gabi-miranda-dxb_HSjoQ40-unsplash.jpg", 75.5,"natural milk 1 litr", 1),
        Store("Banana","https://raw.githubusercontent.com/adizqx/calc/main/banana.jpg", 15.5,"just banana", 1),
        Store("Chips","https://raw.githubusercontent.com/adizqx/calc/main/doritos-unsplash.jpg", 55.5,"Doritos wasabi", 1),
        Store("Beer","https://raw.githubusercontent.com/adizqx/calc/main/corona-unsplash.jpg", 800.5, "Corona extra pack", 6),
        Store("Chocolate","https://raw.githubusercontent.com/adizqx/calc/main/chocolate-unsplash.jpg", 220.5,"Lindt excellence dark", 2)
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.recycleView)

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = MyAdapter(products)
    }
}