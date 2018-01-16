package demo.kotlin

/**
 * 1、@JvmField表示age不能通过setter/getter来获取设置值了，只能直接调用这个属性获取值，或者设置值，
 * Demo6_User.name = "张三"，不能Demo6_User.setname = "张三"
 * 也不能定义为private。
 * 2、var与val区别，后者只能获取值不能设置值，前者是变量，既可以设置值也可以获取值
 */
data class Demo6_User( var name: String, @JvmField  var age: Int);