package com.test.Stream;

import com.xhl.Application;
import com.xhl.entity.Sys_user2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author:xianghuilan
 * @Date:2020/02/0414:36
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class ArTest {
    @Test
    public void arTest(){
        Sys_user2 user2=new Sys_user2();
        user2.setEmail("134@126.com");
//        user2.setId(14L);
        user2.setName("向上33");
        user2.setAge(14);
        boolean bl = user2.insert();//添加方法
        System.out.println(bl);
    }
    @Test
    public void selectById(){
        Sys_user2 ss=new Sys_user2();
        ss.updateById();
        ss.deleteById();
        ss= (Sys_user2) ss.selectById(1);
        System.out.println(ss);
        System.out.println(123);
        System.out.println(345435);
    }
}
