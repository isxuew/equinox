package com.github.isxuew.equinox.common.data.mybatis.config;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;

@Configuration
public class MybatisObjectHandler implements MetaObjectHandler {

    @Override
    public void insertFill(MetaObject metaObject) {
        setFieldValByName("createdBy", LocalDateTime.now().toString(), metaObject);
        setFieldValByName("createdDateTime", LocalDateTime.now(), metaObject);
        setFieldValByName("updatedBy", LocalDateTime.now().toString(), metaObject);
        setFieldValByName("updatedDateTime", LocalDateTime.now(), metaObject);
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        setFieldValByName("updatedBy", LocalDateTime.now().toString(), metaObject);
        setFieldValByName("updatedDateTime", LocalDateTime.now(), metaObject);
    }

}