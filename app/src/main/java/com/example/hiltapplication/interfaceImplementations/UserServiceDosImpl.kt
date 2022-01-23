package com.example.hiltapplication.interfaceImplementations

import com.example.hiltapplication.UserService
import timber.log.Timber
import javax.inject.Inject

class UserServiceDosImpl @Inject constructor(): UserService {
    override fun helloWorld(): String {
        Timber.i("helloWorld()")
        return "Hello World from User Impl Dos"
    }
}