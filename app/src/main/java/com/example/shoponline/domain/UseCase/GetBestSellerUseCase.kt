package com.example.shoponline.domain.UseCase

import androidx.lifecycle.LiveData
import com.example.shoponline.domain.BestSeller
import com.example.shoponline.domain.repository.ShopListRepository

class GetBestSellerUseCase(private val shopListRepository: ShopListRepository) {

    fun getBestSeller(): LiveData<List<BestSeller>> {
        TODO()
    }
}