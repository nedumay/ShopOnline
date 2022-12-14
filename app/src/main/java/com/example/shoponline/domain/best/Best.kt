package com.example.shoponline.domain.best

import com.google.gson.annotations.SerializedName

class Best(
    id:Int?,
    is_favorites :Boolean?,
    title:String?,
    price_without_discount:Int?,
    discount_price:Int?,
    picture:String?
) {
    @SerializedName("id")
    private var id:Int? = id
        get() { return id }
    @SerializedName("is_new")
    private var is_favorites :Boolean? = is_favorites
        get() { return is_favorites }
    @SerializedName("title")
    private var title:String? = title
        get() { return title }
    @SerializedName("price_without_discount")
    private var price_without_discount:Int? = price_without_discount
        get() { return price_without_discount }
    @SerializedName("discount_price")
    private var discount_price:Int? = discount_price
        get() { return discount_price }
    @SerializedName("picture")
    private var picture:String? = picture
        get() { return picture }

}