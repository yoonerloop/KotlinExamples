package demo.kotlin

/**
 * FlatMap遍历 : 11,22,33,44,55
 */
//vararg:可变参数
//"$it ":$表示字符串插入
fun main(vararg args: String) {
    args.flatMap {
        it.split(",")
                .map {
                    print("$it ---");
                }
    }
}

