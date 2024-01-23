package com.tirexmurina.dishapp.category.domain.usecase

import com.tirexmurina.dishapp.category.data.CategoryResponse
import com.tirexmurina.dishapp.category.domain.repository.ICategoryRepository
import javax.inject.Inject

interface IGetCategoriesUseCase {

    suspend operator fun invoke() : CategoryResponse

    /*fun getAllCategories() : String*/
}

class GetCategoriesUseCase @Inject constructor(
    private val repository: ICategoryRepository
): IGetCategoriesUseCase {

    override suspend fun invoke(): CategoryResponse {
        return repository.getAllCategories()
    }

    /*override fun getAllCategories(): String {

    }*/

}