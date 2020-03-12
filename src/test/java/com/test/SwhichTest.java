package com.test;

/**
 * @Author:xianghuilan
 * @Date:2020/03/10 11:22
 */
public class SwhichTest {
    public static void main(String[] args) {
        int labelDataType=1400;
        String s=gg(labelDataType);

        System.out.println(s);
    }
    static String gg(int n){
        switch (n) {
            case 1000:
                return   "LONG";
            case 1300:
            case 1301:
            case 1302:
                return "DATE";
            case 1400:
            case 1600:
                return  "TEXT1";
            default:
                return  "TEXT";
        }
    }
}
