package com.example.shoponline.data

class Common {
    private val BASE_URL = "https://run.mocky.io/v3/"
    val apiService: ApiService
        get() = ApiFactory.getClient(BASE_URL).create(ApiService::class.java)
}