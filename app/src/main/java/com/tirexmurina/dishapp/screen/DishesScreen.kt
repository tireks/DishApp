package com.tirexmurina.dishapp.screen

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun DishesScreen(
    category: String
){
    Text(text = "The category is $category")
}