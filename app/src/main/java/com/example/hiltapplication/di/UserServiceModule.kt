package com.example.hiltapplication.di

import com.example.hiltapplication.UserService
import com.example.hiltapplication.UserServiceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.scopes.ActivityScoped

// @15 Ahora crearemos el módulo que nos permitirá proporcionar esta dependencia donde sea que se requiera.

// InstallIn define en qué tipo de componente se inyectará esta dependencia.
// Module es para indicar que esto es un Hilt Module. Este informa a hilt cómo proporcionar instancias de ciertos tipos.

@InstallIn(ActivityComponent::class)
@Module
abstract class UserServiceModule {
//    @16 Binds indica a hilt qué implementación usar cuando necesite proporcionar una instancia de UserServiceModule. Aquí solo hay una de momento.
//     ActivityScoped define el alcande de vinculación a un componente. Se queda en memoria hasta que se destruye ese componente.
//     (hay ViewModelScoped y no se cuantos más, investigar).
    // Por último la función abstracta dice qué implementación proporcionar cuando se pida una instancia de la interfaz UserService.

    @Binds
    @ActivityScoped
    abstract fun bindUserService(
        userServiceImpl: UserServiceImpl
    ): UserService
}

// Con esto podremos pasar una interfaz mediante vinculación o inyección de campo.
