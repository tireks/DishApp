package com.tirexmurina.dishapp.dishes.data

import retrofit2.http.GET
import retrofit2.http.Query

interface DishesAPI {

    @GET("filter.php?c=")
    suspend fun getDishesForCategory(
        @Query("c") categoryName: String
    ): DishesResponse
}