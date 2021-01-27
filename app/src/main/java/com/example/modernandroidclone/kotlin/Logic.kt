package com.example.modernandroidclone.kotlin

// if, for, when

fun logic() {
    println("**from logic**")

    // if 문
    val x = 2
    if (x % 2 == 0){
        println("짝")
    }

    // if 식
    // 3항 연산자 처럼 썼었음
    val isEven = if (x % 2 == 0) "짝" else "홀"

    // 일반적인 for문
    for(i in 0..9){
        println(i)
    }

    // for-each 문에 해당됨
    val numbers = listOf(1, 2, 3, 4, 5)
    for(i in numbers){
        println(i)
    }

    when (x) {
        1 -> println("1입니다.")
        2 -> println("$x 입니다.")
        3, 4, 5 -> println("3이나 4, 5입니다.")
        in 6..10 -> println("6부터 10사이의 입니다.")
        !in 11..20 -> println("11부터 20사이의 값이 아닙니다.")
        else -> println("디폴트")
    }

    val y = when (x) {
        1 -> {
            // 아래에 있는 것이 초기화 될 값임.
            println("$x 로 초기화 되었습니다.")
            1*x

            // 즉, 아래 처럼 코드가 작성되면 y는 print 문으로 초기화 되므로, Unit형으로 됨.
//            1*x
//            println("$x 로 초기화 되었습니다.")
        }

        2 -> {
            println("$x 의 두배로 초기화 되었습니다.")
            2*x
        }
        else -> 0
    }

    println("when의 결과 : y = $y")
}