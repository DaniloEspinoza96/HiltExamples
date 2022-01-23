package com.example.hiltapplication.interfaceImplementations

import com.example.hiltapplication.UserService
import timber.log.Timber
import javax.inject.Inject

// @22 ahora creams las implementaciones que deseemos, debemos hacer una implementación por cada caso que tengamos
class UserServiceUnoImpl @Inject constructor(): UserService {
    override fun helloWorld(): String {
        Timber.i("helloWorld()")
        return "Hello World from User Impl Uno"
    }
}
