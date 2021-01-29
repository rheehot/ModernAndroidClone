package com.example.modernandroidclone.kotlin

// *** 강의 목차 ***
// 확장함수, 자바와 혼용 사용

fun extensionFunc() {
    println("**from extensionFunc**")

    val str = "Hello"

    println("현재 str($str)의 길이는 ${str.myLength()}")

}

// 예를 들어, 자바에서는 String 클래스에 대한 추가 기능을 구현할 수 없다. String 클래스는 final 로 작성되었기 때문이다.
// 반면, 코틀린에서는 확장함수 기능을 통해, String 클래스에 대한 원하는 기능을 추가적으로 구현할 수 있다.

// 특정 클래스에 원하는 기능을 추가 구현할 수 있는 기능이, 코틀린의 강점 중 하나다.
fun String.myLength(): Int {
    // 여기서 this 는 String
    println("**from String.myLength()**")
    return this.length
}