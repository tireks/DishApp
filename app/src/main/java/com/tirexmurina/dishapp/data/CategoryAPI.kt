package com.tirexmurina.dishapp.data

import retrofit2.http.GET

interface CategoryAPI {

    @GET("categories.php")
    suspend fun getAllCategories(): String

}