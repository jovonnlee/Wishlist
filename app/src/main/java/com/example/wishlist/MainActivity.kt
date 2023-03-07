package com.example.wishlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var items: MutableList<Stuff>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var itemsRv = findViewById<RecyclerView>(R.id.itemRv)
        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            val urlSave = findViewById<EditText>(R.id.et_site)
            val priceSave = findViewById<EditText>(R.id.et_price)
            val itemSave = findViewById<EditText>(R.id.et_item)
            items = WishListUpdater.addStuff(
                itemSave.text.toString(),
                urlSave.text.toString(),
                priceSave.text.toString()
            )
            val adapter = ListAdapter(items)
            itemsRv.adapter = adapter
            itemsRv.layoutManager = LinearLayoutManager(this)
            adapter.notifyDataSetChanged()
            itemSave.text.clear()
            urlSave.text.clear()
            priceSave.text.clear()

        }


    }


}