package demo.java;

import demo.kotlin.Demo9_StringIsEmpeyKt;

/**
 * String扩展方法
 */

class Demo9_ToStringIsEmpty {
    public static void main(String[] args){
        System.out.println(Demo9_StringIsEmpeyKt.isEmpty("hello"));
        System.out.println(Demo9_StringIsEmpeyKt.isEmpty(""));
    }
}
