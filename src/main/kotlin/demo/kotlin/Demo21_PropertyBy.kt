package demo.kotlin

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

/**
 * 属性代理
 *
 * 为其他对象提供一种代理以控制对这个对象的访问,在Java开发过程中采用代理设计模式，
 * kotlin其直接支持委托模式，从而避免为了实现模式而不得不写那些常规的代码。
 */

/**
 * 1、延迟加载lazy:实现延迟加载属性
 *
 * LazyThreadSafetyMode.SYNCHRONIZED
 */

//val a: Int by lazy {
//    100
//}
//
//val c = 200
//
//fun main(args: Array<String>) {
//
//    val b = 300
//
//    println(a) // Log : 100
//    println(c) // Log : 200
//    println(b) // Log : 300
//}

/**
 * 2、Delegates.observable() 函数代理:检测可观察属性的变化，当设设置属性时候调用
 *
 * 当被观察属性的setter()方法被调用的时候调用lambda,同时接收三个参数：
 */
//第一个是初始化值, 第二个是属性值变化事件的响应器
//var name: String by Delegates.observable("wang", {
//    //被赋值的属性, 赋值前的旧属性值, 以及赋值后的新属性值
//    kProperty, oldName, newName ->
//    println("kProperty：${kProperty.name} | oldName:$oldName | newName:$newName")
//})
//
//
//fun main(args: Array<String>) {
//
//    println("name: $name")
//
//    name = "zhang"
//
//    name = "li"
//}

/**
 * 3、Delegates.vetoable()函数代理：设置触发条件
 *
 * 是可观察属性(Observable)的一个特例，不同的是在响应器指定的自动执行执行的lambda表达式中在保存新值
 * 之前做一些条件判断，来决定是否将新值保存。
 */
//第一个是初始化值, 第二个是属性值变化事件的响应器
//var name: String by Delegates.vetoable("wang", {
//    kProperty, oldValue, newValue ->
//    println("oldValue：$oldValue | newValue：$newValue")
//    newValue.contains("wang")
//})
//
//
//fun main(args: Array<String>) {
//
//    println("name: $name") //默认值
//    println("------------------")
//    name = "zhangLing"
//    println("name: $name")  //旧值
//    println("------------------")
//    name = "wangBing"
//    println("name: $name")  //新值
//}

/**
 * 4、Map代理：将属性交给Map:委托属性将从这个 map中读取属性值(使用属性名称字符串作为 key 值)。
 */
//创建构造器
class User(val map: Map<String, Any?>) {
    val name: String by map
    val age: Int by map
}

//类的构造器接受一个 map 实例作为参数:
//fun main(args: Array<String>) {
//
//    val user = User(mapOf(
//            "name" to "李易峰" ,
//            "age" to 37
//
//    ))
//    println(user.name)
//    println(user.age)
//}

/**
 * 4、自定义委托：在自定义委托时，必须实现ReadOnlyProperty或者ReadWriteProperty接口，
 * 具体选择实现哪一个接口取决与委托对象是val属性还是var属性。
 *
 * 创建可读写的委托
 * 1、创建一个委托类SingleValueVar，继承自ReadWriteProperty
 * 2、创建一个委托类实例，用于保存委托的属性。
 * 3、为属性设置委托
 * 4、测试
 */
//
//创建一个委托类SingleValueVar，继承自ReadWriteProperty
class SingleValueVar<T> : ReadWriteProperty<Any?, T> {

    private var value: T? = null

    override fun setValue(thisRef: Any?, property: KProperty<*>, value: T) {
        if (null != value && null == this.value) {
            this.value = value
        }
    }

    override fun getValue(thisRef: Any?, property: KProperty<*>): T {
        return value!!
    }

}

//创建一个委托类实例，用于保存委托的属性。
object DelegatesExt {
    fun <T> singleValueVar(): ReadWriteProperty<Any?, T> = SingleValueVar<T>()
}

//为属性设置委托
class Student {
    var no: Int by DelegatesExt.singleValueVar<Int>()
    var name: String = "wang"
    override fun toString(): String {
        return "no: $no | name: $name"
    }
}

//测试
fun main(args: Array<String>) {
    var stu: Student = Student()

    stu.no = 20
    stu.name = "wang"

    println(stu.toString()) // 打印：no: 20 | name: wang

    stu.no = 30
    stu.name = "li"
    println(stu.toString()) // 打印：no: 20 | name: li
}