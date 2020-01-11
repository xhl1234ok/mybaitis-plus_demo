package com.test.Stream;

import net.sf.jsqlparser.expression.Function;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @Author:xianghuilan
 * @Date:2020-1-11下午 1:21
 */
public class StreamTest2 {
    public static void main(String[] args) {

        //集合--列表list
        List<String> list = new ArrayList();
        list.add("语文");
        list.add("数学");
        list.add("英语");
        list.add("化学124124");
        list.add("历史");
        list.add("生物");
        list.add("政治");

        //中间操作
        // map  map方法接收Function接口(接受一个 泛型T的对象，并返回一个泛型R的对象)
//        list= (List) list.stream().map(x->"我们要上："+x).collect(Collectors.toList());
//        list.forEach(System.out::println);
        //filter 接收Predicate接口（一个参数T,返回boolean）
//        list=list.stream().filter(x -> x.contains("学")).collect(Collectors.toList());
//        list.forEach(System.out::println);
        //foreach 增强型for循环
//        list.forEach(x-> System.out.println("我们需要开了有："+x));//不可以多次操作，peek是中间操作
        //peek  接收Consumer接口，无返回值，一个参数  迭代数据完成依次的处理过程
//         list.stream().peek(x-> System.out.println("第一次迭代："+x))
//                .peek(x-> System.out.println("第二次迭代："+x))
//                .forEach(x-> System.out.println("第三次："+x));
         List<Integer> intList=new ArrayList<Integer>();
         intList.add(23);
         intList.add(20);
         intList.add(15);
         intList.add(2);
         intList.add(43);
         intList.add(43);
         intList.add(43);
         intList.add(223);
       //Stream处理数据
        //parallel
        //sequential
        //unordered
        //distinct 有状态 删除重复结果
//        intList.stream().sorted().distinct().forEach(System.out::println);
        //sorted
//        intList.stream().sorted().forEach(System.out::println);
        //limit 有状态 限制输出数据数量
//        intList.stream().skip(3).limit(2).forEach(System.out::println);
        //skip 有状态，跳过部分数据
//        intList.stream().skip(3).forEach(System.out::println);
        //max 获取最大值
//        Optional optional=intList.stream().max((x,y)->y-x);
//        System.out.println(optional.get());
        //min 获取最小值
//        Optional optional=intList.stream().min((x,y)->x-y);
//        System.out.println(optional.get());
        //reduce 合并处理数据
        Optional optional=intList.stream().reduce((x,y)->x+y);
        System.out.println(optional.get());
    }

}
