package com.example.demo.common.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.github.isxuew.equinox.common.data.entity.BaseDateEntity;
import com.github.isxuew.equinox.common.data.entity.BaseEntity;
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
@TableName("demo_dept")
public class DemoDeptDO extends BaseDateEntity {

    /**
     * 父级
     */
    private Long parentId;

    /**
     * 路径
     */
    private String path;

    /**
     * 部门名称
     */
    private String name;

    /**
     * 部门描述
     */
    private String description;

}