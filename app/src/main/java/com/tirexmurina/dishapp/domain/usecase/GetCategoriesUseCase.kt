package com.tirexmurina.dishapp.domain.usecase

import com.tirexmurina.dishapp.data.CategoryResponse
import com.tirexmurina.dishapp.domain.repository.ICategoryRepository
import javax.inject.Inject

interface IGetCategoriesUseCase {

    suspend operator fun invoke() : CategoryResponse

    /*fun getAllCategories() : String*/
}

class GetCategoriesUseCase @Inject constructor(
    private val repository: ICategoryRepository
): IGetCategoriesUseCase{

    override suspend fun invoke(): CategoryResponse {
        return repository.getAllCategories()
    }

    /*override fun getAllCategories(): String {

    }*/

}