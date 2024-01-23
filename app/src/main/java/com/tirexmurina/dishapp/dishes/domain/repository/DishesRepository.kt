package com.tirexmurina.dishapp.dishes.domain.repository

import com.tirexmurina.dishapp.dishes.data.DishesAPI
import com.tirexmurina.dishapp.dishes.data.DishesResponse
import javax.inject.Inject

interface IDishesRepository{

    suspend fun getDishesForCategory(categoryName: String) : DishesResponse

}

class DishesRepository @Inject constructor(
    val service: DishesAPI
) :IDishesRepository{

    override suspend fun getDishesForCategory(categoryName: String): DishesResponse {
        return service.getDishesForCategory(categoryName)
    }

}