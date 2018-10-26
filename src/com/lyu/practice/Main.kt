package com.lyu.practice

import com.lyu.practice.arithmetic.misunderstand.Decimal

object Main {

    @JvmStatic
    fun main(args: Array<String>) {
        floatMultiplyFloat()
    }

    /**
     * 小数相乘计算精确度不够，二进制格式不能精确表示0.1
     * @link https://www.cnblogs.com/swiftma/p/5411413.html
     */
    private fun floatMultiplyFloat(){
        println(Decimal.floatMultiplyFloat())
    }

    private fun println(`object`: Any) {
        System.out.println(`object`)
    }
}
