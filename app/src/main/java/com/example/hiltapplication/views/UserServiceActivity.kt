package com.example.hiltapplication.views

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.hiltapplication.User
import com.example.hiltapplication.UserService
import dagger.hilt.android.AndroidEntryPoint
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import timber.log.Timber
import javax.inject.Inject


@AndroidEntryPoint
class UserServiceActivity: AppCompatActivity() {
    @Inject lateinit var userService: UserService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val call = userService.listUsers()
        call.enqueue(object : Callback<List<User>> {
            override fun onResponse(call: Call<List<User>>, response: Response<List<User>>) {
                Timber.i("Users Response: ${response.body()}")
            }

            override fun onFailure(call: Call<List<User>>, t: Throwable) {
                Timber.e("Error getting users: ${t}")
            }

        })
    }
}
