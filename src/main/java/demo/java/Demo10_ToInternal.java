package demo.java;

import demo.kotlin.Demo10_Internal;

/**
 * date：2017/12/11 on 10:47
 * description:
 */

class Demo10_ToInternal {
    public static void main (String[] args){
        Demo10_Internal internalKt = new Demo10_Internal();
        String name = internalKt.getName();
        System.out.println(name);
    }
}
