package com.test;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.baomidou.mybatisplus.extension.conditions.update.LambdaUpdateChainWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xhl.Application;
import com.xhl.entity.Sys_user2;
import com.xhl.mapper.SysUser2Mapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

/**
 * @Author:xianghuilan
 * @Date:2020-1-6下午 2:27
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class SampleTest {

    @Autowired
    private SysUser2Mapper userMapper;

    @Test
    public void testSelect() {
//        System.out.println(("----- selectAll method test ------"));
//        List<Sys_user2> userList = userMapper.selectList(null);
//        Assert.assertEquals(5, userList.size());
//        userList.forEach(System.out::println);
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
//         Sys_user2 user2=userMapper.selectById(1);
//        System.out.println(user2);
        //构造条件
//        QueryWrapper<Sys_user2> queryWrapper=new QueryWrapper<>();
//        QueryWrapper queryWrapper1=Wrappers.query();
        //1、名字包含张，年龄小于33，邮箱不为空
//        queryWrapper.like("name","张").le("age",33).isNotNull("email");//第一个参数为数据表的列
        //2、名字包含张，年龄>=20并且<=40，
//         queryWrapper.like("name","张").between("age",22,33).isNotNull("email");
        //3、名字包含张，年龄>=20，按照年龄降序排列，年龄相同按id升序排序 sql where name like '张%' or age>=22 order by age desc,id asc;
//        queryWrapper.likeRight("name","张").or().ge("age",22).orderByDesc("age").orderByAsc("id");
        //4、创建日期为2019年2月13日并且直属上级姓名为王性;数据库函数用apply
        //sql date_format(create-time,'%Y-%m-%d') and studentId in (select id from user where name like '王%')；
//        queryWrapper.apply("date_format(create_date,'%Y-%m-%d')={0}","2020-02-03").inSql("studentId","select id from user where name like '王%'");
        //5、名字为王姓，（年龄小于40或邮箱不为空）
        //sql name like '王%' and (age<40 or email is not null)
//        queryWrapper.likeRight("name","王").and(a->a.lt("age",33).or().isNotNull("email"));
        //6、姓王或者（年龄小于40并且年龄大于20，并且邮箱不为空）
        //sql name like '王%' or（age>20 and age<40 and email is not null）
//        queryWrapper.likeRight("name","王").or(wq->wq.lt("age",40).gt("age",20).isNotNull("email"));
        //7、（年龄小于40，并且邮箱不为空）或者 姓王
        //sql （age>20 and age<40 and email is not null）and name like '王%'
//        queryWrapper.nested(wq->wq.lt("age",40).isNotNull("email")).likeRight("name","王%");
        //8、年龄为30、31、53、23
//        queryWrapper.in("age", Arrays.asList(30,31,53,23));
        //9、返回只满足条件的一条语句
//        queryWrapper.in("age", Arrays.asList(30,31,53,23)).last("limit 1");
        //查询显示有效字段
        //10.名字包含张，年龄小于33
//        queryWrapper.like("name","张").le("age",33).select("id","name");
        //排除字段
//        queryWrapper.select(Sys_user2.class,info->!info.getColumn().equals("create_date")&&!info.getColumn().equals("email"))
//                .like("name","张").le("age",33) ;

        //对象作为参数
//        Sys_user2 user2=new Sys_user2();
//        user2.setAge(24);
//        user2.setName("张三");
//        QueryWrapper<Sys_user2> queryWrapper=new QueryWrapper<>(user2);
//        LambdaQueryWrapper lambdaQueryWrapper=new QueryWrapper<Sys_user2>().lambda();
//        LambdaQueryWrapper lambdaQueryWrapper2=new LambdaQueryWrapper<>();
//        LambdaQueryWrapper<Sys_user2> lambdaWrapper1=Wrappers.lambdaQuery();
//        lambdaWrapper1.like(Sys_user2::getName,"张").lt(Sys_user2::getAge,40);//方法引用

//        List<Sys_user2> list=new LambdaQueryChainWrapper<Sys_user2>(userMapper).like(Sys_user2::getName,"张").lt(Sys_user2::getAge,40).list();
//        list.forEach(System.out::println);

        //分页
//        QueryWrapper<Sys_user2> queryWrapper=new QueryWrapper();
//        queryWrapper.likeRight("name","张").lt("age",40);
//        Page<Sys_user2> page=new Page<Sys_user2>(1,2,false);//不查询总记录数
//        IPage page1=userMapper.selectPage(page,queryWrapper);
//        System.out.println("总页数"+page1.getPages());
//        System.out.println("总行数"+page1.getTotal());
//        System.out.println("查询的数据"+page1.getRecords());

    }
   @Test
    public void update(){
//        Sys_user2 ss=new Sys_user2();
//        ss.setId((long) 1);
//        ss.setAge(38);
//        ss.setEmail("wang@baomidou.com");
//        int num=userMapper.updateById(ss);
//       System.out.println("受影响的行数"+num);


   }
   @Test
    public void updateWrapper(){
//       UpdateWrapper<Sys_user2> updateWrapper=Wrappers.update();
//       updateWrapper.eq("name","王八").eq("id",2).set("name","小花");
//       int num=userMapper.update(null,updateWrapper);
//       System.out.println("受影响的行数"+num);
   }
    @Test
    public void updateLambda(){
//        LambdaUpdateWrapper<Sys_user2> lambdaUpdateWrapper = Wrappers.lambdaUpdate();
//        boolean update = new LambdaUpdateChainWrapper<Sys_user2>(userMapper).eq(Sys_user2::getName, "小花").set(Sys_user2::getAge, 52).update();
//        System.out.println(update);
    }
}
