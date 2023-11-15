package com.tirexmurina.dishapp.domain.repository

import com.tirexmurina.dishapp.data.CategoryAPI
import javax.inject.Inject

interface ICategoryRepository{
    suspend fun getAllCategories() : String
}

class CategoryRepository @Inject constructor(
    private val service: CategoryAPI
) : ICategoryRepository{
    override suspend fun getAllCategories(): String {
        return service.getAllCategories()
    }
}