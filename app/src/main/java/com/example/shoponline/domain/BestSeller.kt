package com.example.shoponline.domain

data class BestSeller(
    val id:Int? = null,
    val is_favorites:Boolean? = null,
    val title:String? = null,
    val price_without_discount:Int? = null,
    val discount_pric:Int? = null,
    val picture:String? = null
)
