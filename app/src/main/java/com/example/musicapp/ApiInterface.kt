package com.example.musicapp

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface ApiInterface {

    @GET("search")
    fun getData(
        @Query("q") query: String,
        @Header("X-RapidAPI-Key") apiKey: String = "785c132d85msh1ea6be75a64d96dp1ab287jsn32e7c75acbc3",
        @Header("X-RapidAPI-Host") apiHost: String = "deezerdevs-deezer.p.rapidapi.com"
    ): Call<MyData>
}