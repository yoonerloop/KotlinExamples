package demo.kotlin

import demo.java.Demo11_JavaBean

/**
 * kotlin 访问Java的属性
 */
fun main(args: Array<String>){
   val bean =  Demo11_JavaBean();
//    println(bean.age)
//    println(bean.name);
//    bean.age = 23;
//    bean.name = "张三";
//    println(bean.age);
//    println(bean.name);

    //抛出异常
    val name: String  = bean.name
    println(name);
}