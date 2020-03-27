package com.lzq.kotlinApp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.lzq.kotlinApp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val dataBinding: ActivityMainBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_main)
        dataBinding.clickListener = View.OnClickListener {
            when (it.id) {
                R.id.first_tv -> {
                    val intent = Intent(this, SecondActivity::class.java)
                    startActivity(intent)
                }
            }
        }
        //        setContentView(R.layout.activity_main)
        data class Person(var name: String, var age: Int)
        val personList: MutableList<Person> = mutableListOf()
        personList.add(Person("wql", 29))
        personList.add(Person("bfj", 29))
        personList.add(Person("lzq", 18))
        personList.add(Person("wp", 22))
        personList.sortedBy { it.age }
        println("排序后 $personList")
        val mist = listOf('1', '2', '3', '4')
        val sum = sum(1, 2)
        Log.e("函数调用", sum.toString())
        if (mist.size !in mist.indices) {
            println("不在区间内部")
        }
        when {
            '1' in mist -> println("我是第一个")
            '3' in mist -> println("我是第三个")
        }
        val mStr = replaceSpace("We Are Happy")
        println("打印替换空格 ,$mStr")
    }

    private fun replaceSpace(str: String): String {
        val stringBuffer = StringBuffer()
        str.forEach {
            when {
                ' ' == it -> stringBuffer.append("%20")
                ' ' != it -> stringBuffer.append(it)
            }
        }
        return stringBuffer.toString()
    }

    private fun sum(a: Int, b: Int): Int? {
        return if (a < 0) {
            a + b
        } else {
            null
        }
    }

    private fun sum2(a: Int, b: Int) = a + b
}
