package com.example.wishlist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ListAdapter(private val items: MutableList<Stuff>) : RecyclerView.Adapter<ListAdapter.ViewHolder>(){

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val itemTextView: TextView
        val urlTextView: TextView
        val priceTextView: TextView
        val itemTextTest: TextView

        init{

            itemTextView = itemView.findViewById(R.id.itemViewer)
            urlTextView= itemView.findViewById(R.id.urlView)
            priceTextView = itemView.findViewById(R.id.priceView)
            itemTextTest = itemTextView


        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        // Inflate the custom layout
        val stuffView = inflater.inflate(R.layout.item_list, parent, false)
        // Return a new holder instance
        return ViewHolder(stuffView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        // Get the data model based on position
        val items = items.get(position)
        // Set item views based on views and data model
        holder.itemTextView.text = items.item
        holder.urlTextView.text = items.url.toString()
        holder.priceTextView.text = items.price.toString()
    }

    override fun getItemCount(): Int {
        return items.size
    }
}