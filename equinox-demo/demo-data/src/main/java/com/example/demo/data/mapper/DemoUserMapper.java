package com.example.demo.data.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.common.entity.DemoUserDO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DemoUserMapper extends BaseMapper<DemoUserDO> {

}
