package com.tirexmurina.dishapp.category.data

import retrofit2.http.GET

interface CategoryAPI {

    @GET("categories.php")
    suspend fun getAllCategories(): CategoryResponse

}