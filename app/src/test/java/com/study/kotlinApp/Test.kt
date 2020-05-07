package com.study.kotlinApp

import junit.framework.TestCase.assertEquals
import org.junit.Test

/**
 * Create by LZQ on 2020/4/8
 **/
class Test {

    @Test
    fun main() {
        data class A(var a: String)
        val map: HashMap<String, A> = HashMap()
        val a = A("我是A")
        map["a"] = a
        map["b"] = a
        map["c"] = A("我是C")
        println(map.size)
        println(map["a"])
        println(map["b"])
        println(map["c"])
        println(map["a"]?.equals(map["b"]))
        println(map["b"].hashCode())
        println(map["c"].hashCode())
//        println(args)

    }
    @Test
    fun basicData() {
        /**
         * Byte Short Int Long Float Double
         * */
        val a: Int? = 10 //int
        println(Integer.MAX_VALUE)
       try {
           val binaryMax = Integer.toBinaryString(0)
           println("二进制数 === $binaryMax")
          val binaryData = Integer.parseInt("000000",2).toString()
           println(binaryData)
       }catch (numeration:NumberFormatException){
//           println(numeration)
       }

    }

}