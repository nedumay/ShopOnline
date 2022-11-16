package com.example.shoponline.domain.UseCase

import androidx.lifecycle.LiveData
import com.example.shoponline.domain.HotSales
import com.example.shoponline.domain.repository.ShopListRepository

class GetHotSalesUseCase(private val shopListRepository: ShopListRepository) {

    fun getHotSales(): LiveData<List<HotSales>> {
        TODO()
    }
}