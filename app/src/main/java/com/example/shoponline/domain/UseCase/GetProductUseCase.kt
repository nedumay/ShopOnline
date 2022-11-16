package com.example.shoponline.domain.UseCase

import androidx.lifecycle.LiveData
import com.example.shoponline.domain.Product
import com.example.shoponline.domain.repository.ShopListRepository

class GetProductUseCase(private val shopListRepository: ShopListRepository) {

    fun getProduct() : LiveData<List<Product>> {
        TODO()
    }
}