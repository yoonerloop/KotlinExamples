package demo.kotlin

/**
 * 1、internal修饰类，相当于publi对于Java没用
 * 2、internal修饰方法，相当于private，Java无法访问此方法
 */
internal class Demo10_Internal{
    fun getName(): String{
        return "张三";
    }
}
