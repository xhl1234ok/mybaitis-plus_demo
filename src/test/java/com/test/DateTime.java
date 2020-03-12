package com.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @Author:xianghuilan
 * @Date:2020/03/11 16:34
 */
public class DateTime {
    public static void main(String[] args) {
        LocalDateTime localDateTime=LocalDateTime.now();
        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
        String strDate3 = dtf3.format(localDateTime);
        System.out.println(strDate3);
        System.out.println(localDateTime);
        LocalDate localDate=LocalDate.now();
        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("yyyyMMdd");
        System.out.println("1213:"+dtf4.format(LocalDateTime.now()));
    }
}
