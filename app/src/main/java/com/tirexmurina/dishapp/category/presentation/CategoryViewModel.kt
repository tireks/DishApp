package com.tirexmurina.dishapp.category.presentation

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.tirexmurina.dishapp.category.data.Category
import com.tirexmurina.dishapp.category.domain.usecase.IGetCategoriesUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CategoryViewModel @Inject constructor(
    useCase: IGetCategoriesUseCase
) : ViewModel() {

    private val _listOfCategories: MutableState<List<Category>> = mutableStateOf(emptyList())
    val listOfCategories: State<List<Category>> = _listOfCategories

    init {
        viewModelScope.launch {
            val categoriesList = useCase()
            categoriesList.categories.forEach{
                _listOfCategories.value = categoriesList.categories
            }

            //Log.d("BK", a)
        }
    }
}