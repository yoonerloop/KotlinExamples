package demo.kotlin

/**
 * 操作重载符
 *
 * 规则：
 * 1、该方法使用operator修饰符
 * 2、该方法的方法名必须被声明为特定的名称，以将对应的操作符映射为这个函数的调用
 * 3、参数必须符合该操作符的规定，比如+的重载就不能有多于一个（不含）的参数，也不能为空参数。
 */
class Demo18_OverLoadingSymbol{
    //注意三个规定（函数名、参数得符合规矩，加operator修饰）
    operator fun plus(a: Demo18_OverLoadingSymbol) {
        println("invoking plus")
    }
}

fun main(args: Array<String>) {
    //重载符
    val a = Demo18_OverLoadingSymbol() + Demo18_OverLoadingSymbol()
    //函数调用
    val b = Demo18_OverLoadingSymbol().plus(Demo18_OverLoadingSymbol())
}