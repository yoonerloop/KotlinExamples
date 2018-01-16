package demo.kotlin

/**
 * 构造函数
 * 1、函数的声明可以是val也可以是var
 * 2、在函数中声明的参数可以当作全局变量
 * 3、构造函数的可见性是 public
 * 4、在 JVM 上,如果主构造函数的所有的参数都有默认值，编译器会生成一个额外的无参构造函数,它将使用默认值
 * 5、没写主构造函数默认创建
 * 6、可以没有次构造函数，但是必须有主构造函数
 *
 * 次构造函数
 * 1、次构造函数不能有声明 val 或 var
 * 2、返回值类型使用this
 */

/**
 * 1、主构造函数
 *
 * 无参数的主构造函数。默认创建
 */
//class Demo19_StructureMethod{
//
//}

/**
 * 2、主构造函数
 *
 * 有参数的构造函数。
 */
//class Demo19_StructureMethod(val args: String) {
//    fun printLength() {
//        println("hello")
//    }
//}

/**
 * 3、主构造函数
 *
 * 有初始化数据的构造函数
 */
//class Demo19_StructureMethod(val args: String) {
//
//    //在主构造函数中不能有任何代码实现，如果有额外的代码需要在构造方法中执行，你需要放到init代码块中执行。
//    init {
//        var length: Int = args.length;
//    }
//
//    //声明属性
//    var length: Int = args.length;
//
//    fun printLength() {
//        println(args.length)
//    }
//}

/**
 * 4、次构造函数
 */
class Demo19_StructureMethod {
    constructor()

    constructor(name: String) {
        println(name)
    }

    /**
     * 不加this(name)不会调用上一个次构造方法
     */
    constructor(name: String, age: Int)  {
        println("$name   ------    age")
    }

    fun sayHello() {
        println("hello")
    }
}

fun main(args: Array<String>) {
    val structureMethod = Demo19_StructureMethod("张三",23)
    println(structureMethod)

}