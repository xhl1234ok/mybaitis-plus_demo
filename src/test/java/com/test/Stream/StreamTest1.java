package com.test.Stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @Author:xianghuilan
 * @Date:2020-1-11下午 1:21
 */
public class StreamTest1 {
    public static void main(String[] args) {
        //1、批量数据 -->Stream对象
        //   多个数据
        Stream stream = Stream.of("admin", "tom", "dame");

        //数组
        String[] strArrays = new String[]{"a","bb"};
        Stream stream2= Arrays.stream(strArrays);

        //集合--列表list
        List list=new ArrayList();
        list.add("语文");
        list.add("数学");
        list.add("英语");
        list.add("化学");
        list.add("历史");
        Stream stream3= list.stream();
        //集合set
        Set set=new HashSet();
        set.add("爸爸");
        set.add("爸爸2");
        set.add("爸爸3");
        set.add("爸爸4");
        set.add("爸爸5");
        Stream stream4=set.stream();

        //map
        Map<String,Integer> map=new HashMap<String,Integer>();
        map.put("lim",1000);
        map.put("xiaoh",1220);
        map.put("zhas",1500);
        map.put("lis",1200);
        Stream stream5=map.entrySet().stream();

        //2、Stream对于基本数据类型的功能封装
        // int long  double
        IntStream.of(new int[]{10,20,30}).forEach(System.out::println);
        IntStream.range(1,5).forEach(System.out::println);//范围包含起始数据，不包含结束数据，打印1-4
        IntStream.rangeClosed(1,5).forEach(System.out::println);//包含起始数据和结束数据，返回IntStream类型

        // 3、Stream--》转换指定类型
//        Object[] obj=stream.toArray(String[]::new);//数组
        String str=stream.collect(Collectors.joining()).toString();//将字符串数组拼接为一个字符串                                                          对象，中断操作只能出现一次。
        System.out.println(str);
        //列表
//        List<String> listx= (List<String>) stream3.collect(Collectors.toList());
        //集合
        Set setx= (Set) stream4.collect(Collectors.toSet());
        System.out.println(setx);
        //map
//        Map<String,Integer> mapx= (Map) stream5.collect(Collectors.toMap(k->,v->v));
//        System.out.println(mapx);
        //list 转map
        Map<String,String> map1= (Map) stream3.collect(Collectors.toMap(x->x, y->"value:"+y));
        System.out.println(map1);
    }

}
