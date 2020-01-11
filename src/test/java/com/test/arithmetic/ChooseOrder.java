package com.test.arithmetic;



import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @Author:xianghuilan 排序
 * @Date:2020-1-9下午 2:53
 */
public class ChooseOrder {
    public static void main(String[] args) {
        List list=new ArrayList<>();
        Random random=new Random();
        for (int i = 0; i < 500; i++) {
            int temp=random.nextInt(500);
            list.add(temp);
        }
        System.out.println(list);
    }
}
