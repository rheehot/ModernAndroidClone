package com.example.modernandroidclone.kotlin

// 클래스

fun classFunc() {
    println("**from classFunc**")

    val person = Person("박세란")

    // 굳이 getter, setter 정의 없이 멤버 접근 가능
    person.name = "한석봉"
    println("person 멤버 변수 name의 상태 : ${person.name}")

    println("animal 생성 전")
    val animal = Animal()
    println("**from classFunc**")
    println("animal 생성 후")
    println("animal 멤버 변수 name의 상태 : ${animal.name}")

}

// class는 기본이 public 임
// 내용이 불필요하면 중괄호 생략 가능
class Person(var name: String)

// 매개 변수가 없으면 소괄호 생략 가능
class Animal {

    val name = "rabbit"

    // init은 생성자가 호출되면 실행되는 블럭
    init {
        println("**from init block at class Animal**")
        println("Animal의 생성자가 호출되어 init 블럭이 실행 됨 !")
    }
}