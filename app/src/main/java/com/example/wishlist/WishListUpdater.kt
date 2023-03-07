package com.example.wishlist

import android.widget.EditText

class WishListUpdater {
    companion object{
        var wishList: MutableList<Stuff> = ArrayList()

        fun addStuff(item: String, url: String, price: String): MutableList<Stuff>{
            wishList.add(0,Stuff(item,url, price))
            return wishList
        }

    }
}