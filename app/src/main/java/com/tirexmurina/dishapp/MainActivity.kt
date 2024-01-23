package com.tirexmurina.dishapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.tirexmurina.dishapp.category.screen.CategoryScreen
import com.tirexmurina.dishapp.dishes.screen.DishesScreen
import com.tirexmurina.dishapp.ui.theme.DishAppTheme
import dagger.hilt.android.AndroidEntryPoint

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
            CategoryScreen(onItemClick = { category ->
                navController.navigate("dishes/${category}")
            })
        }

        composable("dishes/{category}", arguments = listOf(navArgument("category"){
            type = NavType.StringType
        })) {

            val categoryStr = remember {
                it.arguments?.getString("category")
            }

            DishesScreen(categoryStr)
        }
    }
    //CategoryScreen()

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
