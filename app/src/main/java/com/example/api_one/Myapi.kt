package com.example.api_one

import retrofit2.Call
import retrofit2.http.GET

interface Myapi {
    @GET("comments")
    suspend fun getComments(): List<Comments>
}