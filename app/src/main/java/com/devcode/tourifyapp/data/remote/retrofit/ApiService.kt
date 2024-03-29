package com.dicoding.tourifyapp.data.remote.retrofit

import com.dicoding.tourifyapp.data.remote.response.LoginResponse
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface ApiService {

    @FormUrlEncoded
    @POST("login")
    suspend fun doLogin(
        @Field("username") email: String?,
        @Field("password") password: String?
    ): LoginResponse
}