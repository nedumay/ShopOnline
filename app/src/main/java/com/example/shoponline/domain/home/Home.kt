package com.example.shoponline.domain.home

import com.google.gson.annotations.SerializedName

class Home(
    id: Int?,
    is_new :Boolean?,
    title:String?,
    subtitle:String?,
    picture:String?,
    is_buy:Boolean?
){

    @SerializedName("id")
    private var id:Int? = id
        get() { return id }
    @SerializedName("is_new")
    private var is_new :Boolean? = is_new
        get() { return is_new }
    @SerializedName("title")
    private var title:String? = title
        get() { return title }
    @SerializedName("subtitle")
    private var subtitle:String? = subtitle
        get() { return subtitle }
    @SerializedName("picture")
    private var picture:String? = picture
        get() { return picture }
    @SerializedName("is_buy")
    private var is_buy:Boolean? = is_buy
        get() { return is_buy }



}
