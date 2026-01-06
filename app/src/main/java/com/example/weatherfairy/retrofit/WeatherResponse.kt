package com.example.weatherfairy.retrofit

// API JSON 응답 매핑
data class WeatherResponse( // 최상위 응답
    val response: Response // 응답 데이터
)

data class Response(
    val header: Header, // 결과 정보
    val body: Body // 예보 데이터
)

data class Header(
    val resultCode: String, // 결과 코드 (00: 정상, 03: 데이터 없음, 99: 오류)
    val resultMsg: String // 결과 메시지
)

data class Body(
    val items: Items // 예보 항목 리스트
)

data class Items(
    val item: List<WeatherItem> // 예보 데이터 리스트
)

data class WeatherItem(
    val category: String, // 예보 종류
    val fcstDate: String, // 예보 날짜
    val fcstTime: String, // 예보 시간
    val fcstValue: String // 예보 값
)