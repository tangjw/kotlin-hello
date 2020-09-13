package com.github.tangjw.kotlin01

import android.os.Bundle

/**
 * desc
 * <p>
 * Created by TangJunWei on 2020/9/13.
 * <a href="mailto:tjwabc@gmail.com">Contact me</a>
 * <a href="https://github.com/tangjw">Follow me</a>
 */
class TestActivity : MainActivity() {   // MainActivity 设为 open，TestActivity 仍为 final，open没被继承
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

//    override fun haha() {
//        TODO("Not yet implemented")
//    }
}