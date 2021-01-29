package com.example.modernandroidclone.kotlin

// *** 강의 목차 ***
// data 클래스, 상속, 인터페이스 구현

fun dataClass() {
    println("**from dataClass**")

    val dataClass = DataClass("sery270", 23)

    println(dataClass)
    // 객체에 대한 내용을 toString 한 것 처럼 내용이 전부 출력된다.
}

data class DataClass(
    val name: String,
    var age: Int
)