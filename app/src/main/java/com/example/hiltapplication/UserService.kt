package com.example.hiltapplication

import retrofit2.Call
import retrofit2.http.GET

interface UserService {
    @GET("todos")
    fun listUsers(): Call<List<User>>
}