package com.example.shoponline.domain

data class BestSeller(
    var id:Int? = null,
    var is_favorites:Boolean? = null,
    var title:String? = null,
    var price_without_discount:Int? = null,
    var discount_pric:Int? = null,
    var picture:String? = null
)
