package com.example.weatherfairy.retrofit

import retrofit2.http.GET
import retrofit2.http.Query

// API 호출을 정의하는 서비스 인터페이스
interface WeatherService {
    @GET("getVilageFcst") // GET 방식으로 "getVilageFcst" 엔드포인트 호출
    suspend fun getWeather(
        @Query("serviceKey") serviceKey: String, // 발급 받은 인증키
        @Query("pageNo") pageNo: Int = 1, // 페이지 번호
        @Query("numOfRows") numOfRows: Int = 1000, // 한 페이지 결과 수
        @Query("dataType") dataType: String = "JSON", // 응답 자료 형식
        @Query("base_date") baseDate: String, // 발표일자
        @Query("base_time") baseTime: String, // 발표시각
        @Query("nx") nx: Int, // 예보지점 X 좌표
        @Query("ny") ny: Int // 예보지점 Y 좌표
    ): WeatherResponse // JSON -> WeatherResponse
}