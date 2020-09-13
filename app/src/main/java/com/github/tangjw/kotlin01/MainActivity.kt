package com.github.tangjw.kotlin01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

// open 关键字使 MainActivity 能被继承，默认是 final
open class MainActivity : AppCompatActivity(), Impl {

    // 构造函数
    // constructor(){}

    // abstract fun haha() //抽象方法 类也要设置抽象

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun test() {
        TODO("Not yet implemented")

    }


}