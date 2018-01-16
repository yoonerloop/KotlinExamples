package demo.kotlin

/**
 * 函数简化
 */

fun main(args: Array<String>) {
    println(functionReturningIncreasedInteger(2));
}

//fun functionReturningIncreasedInteger(num: Int): Int {
//    return num + 1
//}
/**
 * 简化后的函数
 * 法省略了返回值类型（编译器可以根据后面的表达式推导出返回类型），以及大括号。
 */

fun functionReturningIncreasedInteger(num: Int) = num + 1
