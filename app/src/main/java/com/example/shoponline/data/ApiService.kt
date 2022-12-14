package com.example.shoponline.data

import com.example.shoponline.domain.best.BestSeller
import com.example.shoponline.domain.home.HomeStore
import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET

interface ApiService {

    @GET("654bd15e-b121-49ba-a588-960956b15175")
    fun loadHomeStore(): Single<HomeStore>

    @GET("654bd15e-b121-49ba-a588-960956b15175")
    fun loadBestSeller(): Single<BestSeller>
}