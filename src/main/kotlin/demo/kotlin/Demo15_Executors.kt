package demo.kotlin

import java.util.concurrent.Executors

/**
 * SAM 转换
 * Java中是需要传入一个任务，而这里传入的不是任务，但是不发生错误，
 * 原因：在kotlin调用Java时候会把execute里面的 Lambda 转成 Runnable 在拿过来
 */

fun main(args: Array<String>){
    val workPool = Executors.newWorkStealingPool()
    workPool.execute({
        println("Hello")
    })
}