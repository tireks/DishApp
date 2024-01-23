package com.tirexmurina.dishapp.dishes.domain.usecase

import com.tirexmurina.dishapp.category.data.CategoryResponse
import com.tirexmurina.dishapp.dishes.data.DishesResponse
import com.tirexmurina.dishapp.dishes.domain.repository.DishesRepository
import com.tirexmurina.dishapp.dishes.domain.repository.IDishesRepository
import javax.inject.Inject

interface IGetDishesUseCase {
    suspend operator fun invoke(categoryName: String) : DishesResponse
}

class GetDishesUseCase @Inject constructor(
    val repository: IDishesRepository
): IGetDishesUseCase {
    override suspend fun invoke(categoryName: String): DishesResponse {
        return repository.getDishesForCategory(categoryName)

    }

}