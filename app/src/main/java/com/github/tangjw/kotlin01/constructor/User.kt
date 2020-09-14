package com.github.tangjw.kotlin01.constructor

class User {

    init {
        // 代码块，优先于 构造器执行
    }


    val id: Int
    val name: String
        get() {
            // val 可以通过自定义 getter 返回动态的值
            return "hello$field"
        }

    constructor(id: Int, name: String) {
        this.id = id
        this.name = name
    }

    fun test(finalArg: String) {
        val str = "hello"
        // kotlin 参数是 final的 不能修改
        //finalArg = str + finalArg
    }

    companion object {
        val staticString1 = "哈哈哈哈"
        val staticString2 = "呵呵呵呵"
    }



}