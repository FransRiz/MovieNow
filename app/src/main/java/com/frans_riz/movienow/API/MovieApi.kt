package com.frans_riz.movienow.API

import com.frans_riz.movienow.Entity.ResponseMovies;

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieApi {

    @GET("3/discover/movie")
    fun getAllMovies(@Query("api_key") api_key: String,
                     @Query("language") language: String,
                     @Query("sort_by") sort_by: String,
                     @Query("include_adult") include_adult: String): Call<ResponseMovies>

    @GET("/3/search/movie")
    fun getSearchMovie(@Query("api_key") api_key: String,
                       @Query("language") language: String,
                       @Query("query") query: String,
                       @Query("page") page: String,
                       @Query("include_adult") include_adult: String): Call<ResponseMovies>

    @GET("/3/movie/now_playing")
    fun getNowPlayingMovie(@Query("api_key") api_key: String,
                           @Query("language") language: String): Call<ResponseMovies>

    @GET("/3/movie/upcoming")
    fun getUpComingMovie(@Query("api_key") api_key: String,
                         @Query("language") language: String): Call<ResponseMovies>

    @GET("/3/movie/popular")
    fun getPopularMovies(@Query("api_key") api_key: String,
                         @Query("language") language: String): Call<ResponseMovies>

    @GET("/3/movie/top_rated")
    fun getTopRatedMovies(@Query("api_key") api_key: String,
                          @Query("language") language: String): Call<ResponseMovies>

}
