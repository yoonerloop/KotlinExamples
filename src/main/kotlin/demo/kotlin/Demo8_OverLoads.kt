package demo.kotlin

/**
 * 方法重载: java调用
 * 1、JvmOverloads表示方法重载，可以重载三个不同参数长度的方法
 */
class Demo8_OverLoads {
    @JvmOverloads
    fun overLoaded(a: Int, b: String = "", c: Boolean = false) {
        println("$a $b $c");
    }
}









/**
 * 具名参数: kotlin调用
 * 如果想跳过参数b，只想调用参数a,c怎么办，Kotlin 可以用具名参数做到，Java 中就没有办法享受到了。
 */
fun main(args: Array<String>) {
    //overLoaded(2, c = false) //正确！
    overLoaded(2)
    overLoaded(2, "hello")
    overLoaded(2, "hello", true)
    // overLoaded(2,false) //错误
    overLoaded(2, c = false)
}

fun overLoaded(a: Int, b: String = "", c: Boolean = false) {
    println("$a $b $c");
}

/**
 * 赋值
 */
//fun main(args: Array<String>) {
//    var user = Demo2_User("张三",23)
//    //这里是按照顺序赋值的
//    var(name,age) = user
//    println("$name    $age")
//}