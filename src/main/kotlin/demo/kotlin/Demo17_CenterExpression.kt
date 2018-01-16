package demo.kotlin

/**
 * 中缀表达式
 *
 * 1、方法和函数唯一的区别就是方法必须声明在类里面
 * 2、一个方法如果在声明时有一个infix修饰符，那么它可以使用中缀语法调用。所谓中缀语法就是不需要点和括号的方法调用：
 */

fun main(args: Array<String>) {
    val a = Demo17_CenterExpression()
    a step 2
}

class Demo17_CenterExpression {
    infix fun step(step: Int) {
        println(step)
    }
}

