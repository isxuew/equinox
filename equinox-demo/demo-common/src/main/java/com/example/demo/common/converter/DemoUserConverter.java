package com.example.demo.common.converter;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.common.entity.DemoUserDO;
import com.example.demo.common.entity.DemoUserVO;
import org.mapstruct.Mapper;

import static org.mapstruct.MappingConstants.ComponentModel.SPRING;

@Mapper(componentModel = SPRING)
public interface DemoUserConverter {

    DemoUserVO toVO(DemoUserDO demoUserDO);

    Page<DemoUserVO> toVO(Page<DemoUserDO> page);

}
