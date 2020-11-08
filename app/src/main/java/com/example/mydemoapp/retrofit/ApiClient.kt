package com.example.mydemoapp.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ApiClient {
    var BaseUrl = "http://api.openweathermap.org/"

    public fun getRetrofitClient(): Retrofit? {
        val retrofit = Retrofit.Builder()
                .baseUrl(BaseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build()

        return retrofit
    }
}