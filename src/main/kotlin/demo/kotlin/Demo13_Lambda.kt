package demo.kotlin

/**
 * Lambd表达式
 * 1、方法体用{}括起来
 * 2、里面定义参数
 * 3、参数结束后跟上->，箭头后面是方法体表达式
 * 4、返回结果就是计算内容
 * 5、用 () 的形式调用这个 Lambda 表达式，其实这个 () 对应的是 invoke 方法，换句话说，我们在这里也可以这么写：
 *  println(lamdba.invoke(0,0,0,1))
 */
fun main(arsg: Array<String>) {
    val lamdba = { a: Int, b: Int, c: Int, d: Int
        ->
        a + b + c + d
    }
    println(lamdba(1, 1, 1, 1))
    println(lamdba.invoke(0, 0, 0, 1))
    //高阶函数：接收函数，返回函数
    //inline fun <T, R> T.let(block: (T) -> R): block(this)接收T类型的参数返回R类型的返回值，自己定义的
    //this代表的是调用let的值（进入let源码）
    lamdba(0, 0, 1, 1).let(::println)
}


