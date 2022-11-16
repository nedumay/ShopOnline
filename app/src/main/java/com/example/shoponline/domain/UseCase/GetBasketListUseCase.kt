package com.example.shoponline.domain.UseCase

import androidx.lifecycle.LiveData
import com.example.shoponline.domain.BasketList
import com.example.shoponline.domain.repository.ShopListRepository

class GetBasketListUseCase(private val shopListRepository: ShopListRepository) {

    fun getBasketList(): LiveData<List<BasketList>> {
        TODO()
    }
}