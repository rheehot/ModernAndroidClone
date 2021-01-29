package com.example.modernandroidclone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

// *** 강의 목차 ***
// data 클래스, 상속, 인터페이스 구현 (2020.01.29)
// 람다식

// 자바의 extends, implements 키워드가 :(콜론) 으로 대체 됨
// 클래스의 상속 : 어떤 생성자를 호출하는지 명시, 생성자 표시가 있으면 클래스를 상속 하는 것이다. -> extends
// 인터페이스의 상속 : 그냥 이름까지만 명시, 생성자 표시가 없으면 인터페이스를 구현 하는 것이다. -> implements
// 코틀린 ) class MainActivity : AppCompatActivity(), View.OnClickListener
// 자바 ) public class MainActivity extends AppCompatActivity implements OnClickListener

class MainActivity : AppCompatActivity() {
    // @Override (어노테이션)이 override 키워드로 대치 됨

    // savedInstanceState: Bundle? -> savedInstanceState 로 널 값이 들어올 수 있음
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)

        // 람다식을 사용하지 않는 일반 자바 작성 방식
        // 인터페이스에서 구현할 메서드가 여러개 있을 때
        // Anonymous class 사용 == object 키워드 사용
        button.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                println("Button Clicked")
            }

        })

        // 구현할 메서드가 하나이면, 그냥 람다식으로 작성
        button.setOnClickListener { println("Button Clicked") }

    }
}