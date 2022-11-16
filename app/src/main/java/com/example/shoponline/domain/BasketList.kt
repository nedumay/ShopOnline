package com.example.shoponline.domain

data class BasketList(
    var basket:MutableList<String>? = null,
    var delivery:String? = null,
    var id:String? = null,
    var total:Int? = null
)
