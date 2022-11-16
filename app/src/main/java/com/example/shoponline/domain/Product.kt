package com.example.shoponline.domain

data class Product(
    var CPU:String? = null,
    var camera:String? = null,
    var capacity: MutableList<String>? = null,
    var color: MutableList<String>? = null,
    var id: String? = null,
    var image: MutableList<String>? = null,
    var isFavorites: Boolean? = null,
    var price:Int? = null,
    var rating:Double? = null,
    var sd:String? = null,
    var ssd:String? = null,
    var title:String? = null
)
