package com.tirexmurina.dishapp.domain.usecase

import com.tirexmurina.dishapp.domain.repository.ICategoryRepository
import javax.inject.Inject

interface IGetCategoriesUseCase {
    fun getAllCategories() : String
}

class GetCategoriesUseCase @Inject constructor(
    private val repository: ICategoryRepository
): IGetCategoriesUseCase{

    override fun getAllCategories(): String {
        return "PURR CAN"
    }

}