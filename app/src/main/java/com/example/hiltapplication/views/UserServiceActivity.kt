package com.example.hiltapplication.views

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.example.hiltapplication.R
import com.example.hiltapplication.UserService
import com.example.hiltapplication.di.UserServiceDos
import dagger.hilt.android.AndroidEntryPoint
import timber.log.Timber
import javax.inject.Inject

// @17 Creamos una actividad para implementar lo que configuramos recién.

// Android entry point para que se añada al ambiente de hilt.
@AndroidEntryPoint
class UserServiceActivity: AppCompatActivity() {
//    @19 Inyectamos la interfaz
//    @Inject lateinit var userService: UserService

//    @22 Ahora inyectaremos una de las implementaciones que especificamos, pero debemos decir qué implementacion queremos
    @UserServiceDos
    @Inject lateinit var userService: UserService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Timber.i("called")
        Timber.i(userService.helloWorld())
    }
}
