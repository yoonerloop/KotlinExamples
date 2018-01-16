package demo.kotlin

import demo.java.Demo12_ExtendsMethod
import java.util.*

/**
 * kolin继承Java
 * 1、参数的数据类型(data: String?)必须指定为null还是不为null,通常不为nul
 */

class Demo12_ToExtnedsMethod : Demo12_ExtendsMethod() {
    override fun formatData(data: Date): String {
        return data.toString();
    }
}

fun main(args: Array<String>) {
    val extnedsMethod = Demo12_ToExtnedsMethod()
    val data = extnedsMethod.formatData(Calendar.getInstance().time)
    extnedsMethod.formatTime(Calendar.getInstance().get(Calendar.HOUR_OF_DAY))
    println(data)
}