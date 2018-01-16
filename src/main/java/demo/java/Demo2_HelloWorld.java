package demo.java;

import demo.kotlin.Demo2_User;

/**
 * Java调用kotlin
 */
public class Demo2_HelloWorld {

    public static void main(String[]args){
        Demo2_User user = new Demo2_User("张三", 28);
        System.out.println(user);
    }
}