package com.example.demo.common.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.github.isxuew.equinox.common.data.entity.BaseDateEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@TableName("demo_user")
public class DemoUserDO extends BaseDateEntity {

    /**
     * 用户编码
     */
    private String code;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 性别
     */
    private String sex;

    /**
     * 头像
     */
    private String picture;

}