package com.test;

/**
 * @Author:xianghuilan
 * @Date:2020-1-8上午 9:12
 */
public class StringTest {


    public static void main(String[] args) {
        String s1="hello";
        String s2="world";
        System.out.println(s1+s2);
        change(s1,s2);
        System.out.println(s1+s2);

    }
    public static void change(StringBuffer s1,StringBuffer s2){
        s1=s2;
        s2.append(s1);
    }
    public static void change(String s1,String s2){
        s1=s2;
        s2=s1+s2;
        System.out.println(s1+s2);
    }
}
