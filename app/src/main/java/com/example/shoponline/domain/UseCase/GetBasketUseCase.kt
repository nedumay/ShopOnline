package com.example.shoponline.domain.UseCase

import androidx.lifecycle.LiveData
import com.example.shoponline.domain.Basket
import com.example.shoponline.domain.repository.ShopListRepository

class GetBasketUseCase(private val shopListRepository: ShopListRepository) {

    fun getBasket(): LiveData<List<Basket>> {
        TODO()
    }
}