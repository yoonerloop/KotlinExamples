package demo.kotlin

/**
 * 继承和接口
 *
 * 1、如果没有参数Demo20_ExtendsImpl后面的括号可以省略
 * 2、extends使用:替代
 * 3、Person表示继承的父类
 * 4、()表示调用父类的构造
 * 5、work接口实现和Java一样
 */
class Demo20_ExtendsImpl : Person(), work {

    init {
        println("张三")
    }

    override fun write() {
        println("写代码")
    }

}


open class Person {

}

interface work {
    fun write()
}
