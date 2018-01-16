package demo.java;

import demo.kotlin.Demo6_User;

/**
 * java调用kotlin
 */

class Demo6_ToKotlin {
    public static void main(String[] args){
        Demo6_User user = new Demo6_User("李四", 24);
        System.out.println(user);
        System.out.println(user.getName());
        System.out.println(user.age);
        user.setName("李白");
        System.out.println(user);
    }
}
