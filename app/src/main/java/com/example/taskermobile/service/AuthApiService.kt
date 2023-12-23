package com.example.taskermobile.service

import com.example.taskermobile.model.JwtResponse
import com.example.taskermobile.model.LoginModel
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST

interface AuthApiService {
    @POST("auth/login")
    suspend fun login(
        @Body auth: LoginModel,
    ): Response<JwtResponse>

    @GET("auth/refresh")
    suspend fun refreshToken(
        @Header("Authorization") token: String,
    ): Response<JwtResponse>
}