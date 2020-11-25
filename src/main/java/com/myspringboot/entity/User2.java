package com.myspringboot.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;


/**
 * @ProjectName: try
 * @Package: com.myspringboot.entity
 * @ClassName: User2
 * @Author: Hasee
 * @Description:
 * @Date: 2020/11/24 17:03
 * @Version: 1.0
 */
@Data
@TableName("user_2")
public class User2 {

    private Integer id;
    private String name;
    private String sex;

    @TableField(fill = FieldFill.INSERT)
    private Date createtime;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updatetime;
}
