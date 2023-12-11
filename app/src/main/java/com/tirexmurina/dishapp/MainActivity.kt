package com.tirexmurina.dishapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.tirexmurina.dishapp.screen.CategoryScreen
import com.tirexmurina.dishapp.screen.DishesScreen
import com.tirexmurina.dishapp.ui.theme.DishAppTheme
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DishAppTheme {
                DishApp()
            }
        }
    }
}

@Composable
fun DishApp(){
    //TODO
    /**
     * split this NavHost
     * composables - cs
     * composables - DishesScreen
     *
     * **/

    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "category"){
        composable("category") {
            CategoryScreen()
        }

        composable("dishes") {
            DishesScreen()
        }
    }
    CategoryScreen()

    //DishesScreen()
}

/*
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DishAppTheme {
        Greeting("Android")
    }
}*/
