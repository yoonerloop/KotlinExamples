package demo.kotlin

/**
 * 1.enmu：class在class之前，可以共存
 * 2.静态方法：需要用 companion object包起来
 * 3.扩展方法：用于对其他类的扩展
 * 4.when：相当于switch，但是有返回值
 */
//enum class在class之前，可以共存
//val day: String的参数和下面的常量参数对应
enum class Lang(val day: String) {
    SUN("一"), MON("二"), TUE("三"), WED("四");

    //Kotlin的class并不支持static变量,所以需要使用companion object来声明static变量
    companion object {
        fun parse(day: String): Lang {
            return Lang.valueOf(day.toUpperCase());
        }
    }
    fun sayDay() {
        println(day);
    }

}


fun main(args: Array<String>) {
    if (args.size == 0) {
        return
    } else {
        val lang = Lang.parse(args[0]);
        println(lang);
        lang.sayDay();

        //扩展方法
        lang.sayBye();
    }
}

/**
 * 扩展方法，使用场景：当上面的enum是别人提供时，但是没有要自己使用的方法时候，可以使用扩展方法，进行扩展
 * when相当于switch，但是他有返回值，switch没有返回值
 */
fun Lang.sayBye() {
    val bay = when (this) {
        Lang.SUN -> "星期一"
        Lang.MON -> "星期二"
        Lang.TUE -> "星期三"
        Lang.WED -> "星期四"
    }
    println(bay);
}