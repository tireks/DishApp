package com.tirexmurina.dishapp.di

import android.app.Activity
import com.tirexmurina.dishapp.domain.repository.CategoryRepository
import com.tirexmurina.dishapp.domain.repository.ICategoryRepository
import com.tirexmurina.dishapp.domain.usecase.GetCategoriesUseCase
import com.tirexmurina.dishapp.domain.usecase.IGetCategoriesUseCase
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.scopes.ActivityScoped
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Module
    @InstallIn(SingletonComponent::class)
    interface AppModuleInt{

        @Binds
        @Singleton
        fun provideCategoryRepository(repository: CategoryRepository) : ICategoryRepository

        @Binds
        @Singleton
        fun provideGetCategoryUseCase(usecase: GetCategoriesUseCase) : IGetCategoriesUseCase
    }

}