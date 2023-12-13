package com.tirexmurina.dishapp.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import coil.compose.rememberAsyncImagePainter
import coil.compose.rememberImagePainter
import com.tirexmurina.dishapp.R
import com.tirexmurina.dishapp.data.Category
import com.tirexmurina.dishapp.presentation.CategoryViewModel
import dagger.hilt.android.lifecycle.HiltViewModel

@Composable
fun CategoryScreen(
    viewModel: CategoryViewModel = hiltViewModel(),
    onItemClick: (String ) -> Unit
){
    val listOfCategories by remember { viewModel.listOfCategories }

    LazyColumn {
        items(listOfCategories) { item ->
            SingleCategoryItem(category = item, onClick = {
                onItemClick(it)
            })
        }
    }

}

@Composable
fun SingleCategoryItem(
    category: Category,
    onClick: (String) -> Unit
){
    Card(
        modifier = Modifier
            .padding(8.dp)
            .clickable { onClick(category.strCategory) }
            .fillMaxWidth(), elevation = CardDefaults.cardElevation(
            defaultElevation = 10.dp
        )
    ) {
        /*Row(Modifier.padding(16.dp), verticalAlignment = Alignment.CenterVertically) {
            Image(
                modifier = Modifier.size(80.dp), painter = rememberAsyncImagePainter(
                    category.strCategoryThumb
                ), contentDescription = null
            )
            Text(text = category.strCategory, fontSize = 24.sp)
        }*/
        Column() {
            Box(modifier = Modifier.height(230.dp)) {
                Image(
                    painter = rememberAsyncImagePainter(
                        category.strCategoryThumb
                    ),
                    contentDescription = null,
                    contentScale = ContentScale.FillHeight,
                    modifier = Modifier.fillMaxSize()
                )
            }
            Box(modifier = Modifier
                .background(color = Color.White)
                .fillMaxWidth()
                .padding(16.dp)
            ){
                Text(text = category.strCategory, fontSize = 24.sp)
            }
        }
    }

}

/*
@Preview
@Composable
fun PreviewItem(){
    Card(
        modifier = Modifier.padding(8.dp),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 10.dp
        )
    ) {
        Column() {
            Box(modifier = Modifier.height(230.dp)) {
                Image(
                    painterResource(id = R.drawable._09593_1200x600x70_c),
                    contentDescription = null,
                    contentScale = ContentScale.FillHeight,
                    modifier = Modifier.fillMaxSize()
                )
            }
            Box(modifier = Modifier
                .background(color = Color.White)
                .fillMaxWidth()
                .padding(16.dp)
            ){
                Text(text = "Beer", fontSize = 24.sp)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewRecycler(){
    LazyColumn {
        items(5) {
            PreviewItem()
        }
    }
}*/
