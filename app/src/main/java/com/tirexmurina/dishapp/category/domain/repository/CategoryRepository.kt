package com.tirexmurina.dishapp.category.domain.repository

import com.tirexmurina.dishapp.category.data.CategoryAPI
import com.tirexmurina.dishapp.category.data.CategoryResponse
import javax.inject.Inject

interface ICategoryRepository{
    suspend fun getAllCategories() : CategoryResponse
}

class CategoryRepository @Inject constructor(
    private val service: CategoryAPI
) : ICategoryRepository {
    override suspend fun getAllCategories(): CategoryResponse {
        return service.getAllCategories()
    }
}