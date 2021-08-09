package com.mani.api.services

import com.mani.api.models.ArticlesResponse
import retrofit2.Call
import retrofit2.http.GET

interface ConduitApi {
    @GET("articles")
    fun getArticles() : Call<ArticlesResponse>
}