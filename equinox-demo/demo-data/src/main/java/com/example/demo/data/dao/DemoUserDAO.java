package com.example.demo.data.dao;

import com.example.demo.common.entity.DemoUserDO;
import com.example.demo.data.mapper.DemoUserMapper;
import com.github.isxuew.equinox.common.data.BaseDAO;
import org.springframework.stereotype.Repository;

@Repository
public class DemoUserDAO extends BaseDAO<DemoUserMapper, DemoUserDO> {

}
