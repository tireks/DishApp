package com.tirexmurina.dishapp.di

import com.tirexmurina.dishapp.category.data.CategoryAPI
import com.tirexmurina.dishapp.category.domain.repository.CategoryRepository
import com.tirexmurina.dishapp.category.domain.repository.ICategoryRepository
import com.tirexmurina.dishapp.category.domain.usecase.GetCategoriesUseCase
import com.tirexmurina.dishapp.category.domain.usecase.IGetCategoriesUseCase
import com.tirexmurina.dishapp.dishes.data.DishesAPI
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Provides
    @Singleton
    fun provideRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://www.themealdb.com/api/json/v1/1/")  //not sure that it should be there. Maybe in repositoryImplementation?
            //.addConverterFactory(ScalarsConverterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Provides
    @Singleton
    fun providesCategoryService(retrofit: Retrofit): CategoryAPI {
        return retrofit.create(CategoryAPI::class.java)
    }

    @Provides
    @Singleton
    fun providesDishesService(retrofit: Retrofit): DishesAPI {
        return retrofit.create(DishesAPI::class.java)
    }

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