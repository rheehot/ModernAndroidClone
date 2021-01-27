package com.example.modernandroidclone.kotlin

fun main() {
    print("Hello World")

    // 코틀린은 자동으로 타입을 추론해줌, 보통은 타입을 생략함
    var x = 10 // Int 형 변수
    var isSelected = true // Bool
    var str = "Hello" // String

    // 아래와 같이 선언과 초기화를 분리하는 것은 지양하는 것이 좋음
    // 위 처럼 선언과 초기화를 같이 하는 것이 코틀린의 방식이다.
    var a: Int
    a = 10

    // 코틀린의 기본 자료형은 모두 대문자로 시작
    // int, float, double
    // Int Float, Double

    // val 은 상수로, 값을 다시 초기화 할 수 없으
    val b = 10
//    b = 11

    // 굳이 str + "World" 하지 않고 $를 붙여서 사용가능
    print("$str World")

    // ${}를 사용하여, 수식을 바로 넣을 수 있음
    print("${x+x} World")

    print(myMethod(10, x+1))
}

//fun myMethod(a: Int, b: Int): Int {
//    return a + b
//}

// 위 함수를 축약하여, 아래와 같이 작성할 수 있다. (블럭을 생략할 수 있다.)
// 한줄짜리 함수는 아래와 같이 작성 가능하다.
fun myMethod(a: Int, b: Int): Int = a + b