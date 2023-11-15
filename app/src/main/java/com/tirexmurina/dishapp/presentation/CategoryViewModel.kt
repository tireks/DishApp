package com.tirexmurina.dishapp.presentation

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.tirexmurina.dishapp.domain.usecase.IGetCategoriesUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CategoryViewModel @Inject constructor(
    useCase: IGetCategoriesUseCase
) : ViewModel() {
    init {
        viewModelScope.launch {
            val a = useCase()
            Log.d("BK", a)
        }
    }
}