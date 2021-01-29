package com.example.modernandroidclone.kotlin

// *** 강의 목차 ***
// 변수, 상수, 기본자료형, 메서드
// Unit, 배열, 리스트

fun data() {
    println("**from data**")

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
    println("$str World")

    // ${}를 사용하여, 수식을 바로 넣을 수 있음
    println("${x+x} World")

    // 배열
    // 변수와 상수 중에, 상수를 적극적으로 사용하는 것이 좋다.
    // 자바의 에러를 예방하는 방법이다.
    val arrayItem = arrayOf(1, 2, 3, 4, 5) // 잘 쓰지 않음
    val listItem =  listOf(1, 2, 3, 4, 5)
    // 리스트를 더 많이 사용함
    // 리스트는 값은 불변임. 값을 변경할 수 없음. 에러를 예방
    // val listItem =  listOf<Int>(1, 2, 3, 4, 5) 에서 <Int>가 생략됨

    val arrayListItem =  arrayListOf(1, 2, 3, 4, 50) // 변경 가능
    arrayListItem.add(6)
    arrayListItem.remove(50) // element 값과 같은 값을 가지는 원소를 날림
    arrayListItem.set(0, 10)
    arrayListItem[0] = 10 // 위의 코드와 같음

    println(arrayListItem)

}

//fun myMethod(a: Int, b: Int): Int {
//    return a + b
//}

// 위 함수를 축약하여, 아래와 같이 작성할 수 있다. (블럭을 생략할 수 있다.)
// 한줄짜리 함수는 아래와 같이 작성 가능하다.
fun myMethod(a: Int, b: Int): Int = a + b

// 리턴이 없는 함수
// Unit == Void, 보통 생략하는 경우가 많음
fun noReturnMethod(a: Int, b: Int) {
    println("I am Unit Method ! ")
}
//
//fun noReturnMethod(a: Int, b: Int): Unit {
//    println("I am Unit Method ! ")
//}
