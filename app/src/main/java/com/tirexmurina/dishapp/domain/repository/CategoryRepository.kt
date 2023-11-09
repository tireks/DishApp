package com.tirexmurina.dishapp.domain.repository

interface ICategoryRepository{
    fun getAllCategories() : String
}

class CategoryRepository : ICategoryRepository{
    override fun getAllCategories(): String {
        return "page 42"
    }
}