package com.example.hiltapplication.di

import com.example.hiltapplication.UserService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import timber.log.Timber

@InstallIn(ActivityComponent::class)
@Module
object RetrofitModule {
    // @ 1 Provides provee la dependencia que se requiera dentro del scope que esté, en este caso cuando se requiera algo de tipo Retrofit, hilt verá que está
//    en el scope de la activity y proveerá esto. En este caso, provideUserService requiere retrofit, por tento correrá lo de arriba, lo visualizaremos con timber
//    luego, cuando se requiera UserService, se solicitará provideUserService.
    @Provides
    fun provideRetrofit(): Retrofit {
        Timber.i("Returning retrofit builder")
        return Retrofit.Builder()
            .baseUrl("https://jsonplaceholder.typicode.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Provides
    fun provideUserService(retrofit: Retrofit): UserService {
        Timber.i("Providing UserService")
        return retrofit.create(UserService::class.java)
    }
}
