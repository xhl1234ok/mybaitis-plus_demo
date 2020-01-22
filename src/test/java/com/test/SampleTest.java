package com.test;

import com.xhl.Application;
import com.xhl.entity.Sys_user2;
import com.xhl.mapper.IUserMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.List;

/**
 * @Author:xianghuilan
 * @Date:2020-1-6下午 2:27
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class SampleTest {

    @Autowired
    private IUserMapper userMapper;

    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<Sys_user2> userList = userMapper.selectList(null);
        Assert.assertEquals(5, userList.size());
        userList.forEach(System.out::println);
    }
//    @Test
//    public void insert() {
//        Sys_user2 user=new Sys_user2();
//        user.setAge(33);
//        user.setId(Long.valueOf(11));
//        user.setName("xiaoshi");
//        user.setEmail("12344@qq.com");
//        int n=userMapper.insert(user);
//        System.out.println(n);
//    }
    @Test
    public void selectById(){

    }

}
