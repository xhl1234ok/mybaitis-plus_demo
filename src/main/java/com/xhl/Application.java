package com.xhl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author:xianghuilan
 * @Date:2020-1-6下午 1:53
 */

@SpringBootApplication
@MapperScan("com.xhl.*")
public class Application{

    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);
    }

}

