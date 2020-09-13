package com.github.tangjw.kotlin01

import android.graphics.Color
import android.view.View
import android.widget.Button

/**
 * desc
 * <p>
 * Created by TangJunWei on 2020/9/13.
 * <a href="mailto:tjwabc@gmail.com">Contact me</a>
 * <a href="https://github.com/tangjw">Follow me</a>
 */
class Sample {
    // 变量声明，会报错必须初始化  kotlin 空安全设计
    // var v: View = null

    // ?解除非空限制，仍然必须初始化 = null ，kotlin没有默认值
    var name: String? = null
    var name1: String? = "LaoWang"


    fun test() {
        var view: View? = null
        // 报错 必须加 ?
        // view.setBackgroundColor(Color.RED)
        // kotlin 会自动对变量进行非空判断，才会执行方法，并且线程安全
        view?.setBackgroundColor(Color.RED)
        // !!不检查非空判断，强制执行，和 java 直接调用一样
        view!!.setBackgroundColor(Color.RED)
    }

    // lateinit 可以延迟初始化，需要用户保证使用前已经初始化
    lateinit var viewBtn: Button

    fun findBtn(rootView: View) {
        viewBtn = rootView.findViewWithTag("btn")
    }

    // 类型推断
    var nameX = "LaoWang"
    fun testX() {
        // nameX = 1; nameX 已经被推断为 String 类型
        nameX = "LaoZhang";
        println(nameX.length)
    }

    // val声明变量 类似 java final
    val age: Int = 18
    fun testAge() {
        //age = 20 // val 类型已经不能重新指定新的值
    }

    // kotlin 方法声明 有返回值
    fun funTest(name: String): String {
        return "hello-$name"    // 支持模板字符串
    }

    // 无返回值
    fun funTest1(): Unit {}

    // 或 省略 Unit
    fun funTest2() {}

    var str1 = "hello"
    var str2: String? = null

    fun funTest3() {
        funTest4(str1)
        funTest5(str1)      // 非空变量可传递可空参数
        // funTest4(str2)     // 可空变量不能传递非空参数
        funTest5(str2)      // 可空变量可传递可空参数
    }


    fun funTest4(name: String) {
        println(name.length)
    }

    fun funTest5(name: String?) {
        println(name?.length)
    }

    // getter / setter
    open class User {
        var name = "hello"
            get() { //手写get
                return "hello-${field}"
            }
        var age: Int = 18
            get() { //手写get
                return field + 2
            }
    }

    fun testUser() {
        var user: User = User()
        // user.name = user.getName()
        println(user.name)
        println(user.age)
    }


    // 数据类型
    var number: Int = 1 // Double Float Long Short Byte
    var c: Char = 'c'
    var b: Boolean = true

    // IntArray FloatArray DoubleArray CharArray
    var arr: IntArray = intArrayOf(1, 2, 3)
    var str11: String = "hello"

    // 不可孔类型，IntArray FloatArray等，此时是未装箱
    var i1: Int = 1 // 没有装箱
    var i2: Int? = 2 // 自动装箱
    var list: List<Int> = listOf(1, 2, 3)  // 自动装箱
    var array: IntArray = intArrayOf(1, 2, 3)  // 未装箱

    // 实例化，没有 new
    var user1: User = User()

    class Userr : User() {
        fun hhh() {

        }
    }

    // 类型转换
    var userr: User = Userr()
    fun test11() {
        var userr: User = Userr()
        if (userr is Userr) {
            userr.hhh()
        }
        (userr as Userr).hhh()

        // 安全的强转，如果能转就执行，得到一个 可空对象，所以用 ?.test() 调用方法
        (userr as? Userr)?.hhh()
    }
}