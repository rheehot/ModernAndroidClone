package com.example.modernandroidclone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

// data 클래스, 상속, 인터페이스 구현 (2020.01.29)

// 자바의 extends, implements 키워드가 :(콜론) 으로 대체 됨
// 클래스의 상속 : 어떤 생성자를 호출하는지 명시, 생성자 표시가 있으면 클래스를 상속 하는 것이다. -> extends
// 인터페이스의 상속 : 그냥 이름까지만 명시, 생성자 표시가 없으면 인터페이스를 구현 하는 것이다. -> implements
// 코틀린 ) class MainActivity : AppCompatActivity(), View.OnClickListener
// 자바 ) public class MainActivity extends AppCompatActivity implements OnClickListener

class MainActivity : AppCompatActivity() {
    // @Override (어노테이션)이 override 키워드로 대치 됨

    // savedInstanceState: Bundle? -> savedInstanceState로 널 값이 들어올 수 있음
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}