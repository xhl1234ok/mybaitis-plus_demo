package com.test.arithmetic;

/**
 * @Author:xianghuilan
 * @Date:2020-1-11上午 11:14
 */
public interface Jdk1_8 {
    default void test(){
        System.out.println("12343");
    }
    static void  test2(){
        System.out.println("静态方法");
    }
}

class JdkImpl implements Jdk1_8{
    public static void main(String[] args) {
        JdkImpl jdk=new JdkImpl();
        jdk.test();
        Jdk1_8.test2();
    }
}