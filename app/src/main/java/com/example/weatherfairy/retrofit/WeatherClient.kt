package com.example.weatherfairy.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

// Retrofit 설정을 통해 서비스를 생성하고 재사용 가능하게 제공
object WeatherClient {
    private const val BASE_URL =
        "http://apis.data.go.kr/1360000/VilageFcstInfoService_2.0/"

    val service: WeatherService by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            // JSON <-> 코틀린 객체 변환기 등록
            .addConverterFactory(GsonConverterFactory.create())
            .build() // Retrofit 객체 생성
            .create(WeatherService::class.java) // WeatherService 구현체 생성
    }
}