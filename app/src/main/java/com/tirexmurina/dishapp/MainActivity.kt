package com.tirexmurina.dishapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import com.tirexmurina.dishapp.screen.CategoryScreen
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
    CategoryScreen()
}

/*
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DishAppTheme {
        Greeting("Android")
    }
}*/
