package com.test;

import com.baomidou.mybatisplus.extension.plugins.OptimisticLockerInterceptor;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

/**
 * @Author:xianghuilan
 * @Date:2020/02/0509:32
 */
public class LocalDatT {
    public static void main(String[] args) {
//        LocalDateTime now = LocalDateTime.now();
//        LocalDate now1 = LocalDate.now();
//        LocalTime now2 = LocalTime.now();
//        System.out.println(now);
//        System.out.println(now1);
//        System.out.println(now2);
//        LocalDateTime today_end = LocalDateTime.of(LocalDate.now(), LocalTime.MAX);//当天24点
//        System.out.println("today_end"+today_end);
//         toString2();
        //通过localdatetime获取long型毫秒时间
        Long newSecond1 = LocalDateTime.now().toInstant(ZoneOffset.of("+8")).toEpochMilli();
        System.out.println(newSecond1);
    }
    public  static void toString2(){
        //和String类型相互转换
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime time = LocalDateTime.now();
        String localTime = df.format(time);
        LocalDateTime ldt = LocalDateTime.parse("2017-09-28 17:07:05",df);
        System.out.println("LocalDateTime转成String类型的时间："+localTime);
        System.out.println("String类型的时间转成LocalDateTime："+ldt);
    }

}
