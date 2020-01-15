package com.xhl.entity;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 *
 */
@Data
@TableName("user")
public class Sys_user2 {
    @TableId
    private Long id;
    @TableField("name")
    private String name;
    private Integer age;
    private String email;
    @TableField(exist = false)
    private String noFiled;//表中没有的字段
    private transient String remark;//该字段不参与序列化过程
}