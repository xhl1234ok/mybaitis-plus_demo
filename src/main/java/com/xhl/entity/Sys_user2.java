package com.xhl.entity;


import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.sql.Date;

/**
 *
 */
@Data
@TableName("user")
@EqualsAndHashCode(callSuper = true)
public class Sys_user2 extends Model {
    @TableId(type = IdType.AUTO)
    private Long id;
    @TableField(value = "name",condition = SqlCondition.LIKE)
    private String name;
    private Integer age;
    private String email;
    private String createDate;
    @TableField(exist = false)
    private String noFiled;//表中没有的字段
    private transient String remark;//该字段不参与序列化过程
    @Override
    protected Serializable pkVal() {
        return id;
    }
}