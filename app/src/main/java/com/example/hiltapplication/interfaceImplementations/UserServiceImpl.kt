package com.example.hiltapplication.interfaceImplementations

import com.example.hiltapplication.UserService
import timber.log.Timber
import javax.inject.Inject

// @14 Ahora crearemos una implementación de esta interfaz y agregaremos @Inject en el constructor, para decirle a hilt cómo proveer esta instancia
class UserServiceImpl @Inject constructor(): UserService {
    override fun helloWorld(): String {
        Timber.i("helloWorld()")
        return "Hello World from User Impl"
    }
}