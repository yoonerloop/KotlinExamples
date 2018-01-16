package demo.kotlin

/**
 * 遍历集合
 */
// （1）	Unit表示返回值，空类型，不写默认返回，返回值写在这里
// （2）	args.map(::println)相当于上述内容，打印内容一样，demo13有详细讲解
// （3）	迭代数据
// （4）	It相当于遍历器
fun main(args: Array<String>){

    args.map{
        println(it)
    }
    args.map(::println)
}
