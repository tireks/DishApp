package com.tirexmurina.dishapp.presentation

import androidx.lifecycle.ViewModel
import com.tirexmurina.dishapp.domain.usecase.IGetCategoriesUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CategoryViewModel @Inject constructor(
    val usecase: IGetCategoriesUseCase
) : ViewModel() {

}