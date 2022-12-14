package com.example.shoponline.domain.home

import com.google.gson.annotations.SerializedName

class HomeStore(home: List<Home?>) {

    @SerializedName("home_store")
    private var home: List<Home?> = home
        get() { return home }


}