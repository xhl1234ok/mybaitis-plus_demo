package com.test;

import com.baomidou.mybatisplus.core.conditions.segments.HavingSegmentList;
import com.xhl.entity.User;
import com.xhl.service.IUserService;

import java.util.*;
import java.util.function.Predicate;

/**
 * @Author:xianghuilan
 * @Date:2020-1-7上午 11:19
 */
public class t2 {
    public static void main(String[] args) {
//       Test test=(String ss)-> System.out.println(ss);
//       test.ss("14");
//       StringBuffer s1;
//       StringBuilder s2=new StringBuilder("123");
//       s2.append("");
//        List list=new ArrayList();

//        Collections.sort(list, new Comparator<Object>() {
//            @Override
//            public int compare(Object o1, Object o2) {
//                return 0;
//            }
//        });
        Random random=new Random();
        for (int i = 0; i <10; i++) {
            System.out.println(random.nextDouble());


        }

    }
}

interface  Test  {
    void ss(String s);
}
