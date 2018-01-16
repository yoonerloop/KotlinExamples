package demo.java;

import demo.kotlin.Demo8_OverLoads;

/**
 * 方法重载
 */

class Demo8_ToOverLoads {
    public static void main(String[] args) {
        Demo8_OverLoads overLoadsKt = new Demo8_OverLoads();
        overLoadsKt.overLoaded(2, "hello", true);
        overLoadsKt.overLoaded(2, "hello");
        overLoadsKt.overLoaded(2);
    }
}
