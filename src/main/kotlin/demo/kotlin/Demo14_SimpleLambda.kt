package demo.kotlin

/**
 * Lambd表达式的简化
 */
fun main(args: Array<String>) {
    /**
     * 默认形式
     */
    args.forEach {
        println(it)
    }

    /**
     * 1、形式一：for循环遍历
     */
    for (arg in args) {
        println(arg)
    }

    /**
     * 2、形式二：forEach遍历
     */
    args.forEach({
        element -> println(element)//Lambd表达式
    })

    /**
     * 3、形式三：Kotlin 允许我们把函数的最后一个Lambda表达式参数移除括号外
     */
    args.forEach() {
        element -> println(element)
    }

    /**
     *  4、形式四：如果方法只剩一个lambda表达式，如上面的3，（）里面空的，没啥用，可以删除
     */
    args.forEach{
        element -> println(element)
    }

    /**
     * 5、形式五：参数只有一个 element ，于是我们也可以在调用的时候省略他，并且默认它叫 it
     */
    args.forEach{
         println(it)
    }

    /**
     * 6、如果这个 Lambda 表达式里面只有一个函数调用，并且这个函数的参数也是这个Lambda表达式的参数
     */
    args.forEach (::println)

}


