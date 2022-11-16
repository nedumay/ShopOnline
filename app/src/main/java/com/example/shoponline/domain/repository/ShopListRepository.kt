package com.example.shoponline.domain.repository

import androidx.lifecycle.LiveData
import com.example.shoponline.domain.*

interface ShopListRepository {

    //получение списка продукта
    fun getProduct() : LiveData<List<Product>>

    //получение списка BestSeller
    fun getBestSeller(): LiveData<List<BestSeller>>

    //получение списка HotSales
    fun getHotSales(): LiveData<List<HotSales>>

    //получение списка Basket
    fun getBasket(): LiveData<List<Basket>>

    //получение списка BasketList
    fun getBasketList(): LiveData<List<BasketList>>
}