package com.example.api_one

import retrofit2.Call

class CommentRepo {
    private val commService =RetrofitInstance.commentService

    suspend fun getComments(): List<Comments> {
        return commService.getComments()
    }

}