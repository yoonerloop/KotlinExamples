package demo.kotlin

/**
 * String的扩展方法
 */
fun String.isEmpty(): Boolean? {
    return this != ""
}