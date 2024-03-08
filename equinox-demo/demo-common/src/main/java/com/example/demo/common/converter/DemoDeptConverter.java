package com.example.demo.common.converter;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.common.entity.DemoDeptDO;
import com.example.demo.common.entity.DemoDeptVO;
import org.mapstruct.Mapper;

import static org.mapstruct.MappingConstants.ComponentModel.SPRING;

@Mapper(componentModel = SPRING)
public interface DemoDeptConverter {

    DemoDeptVO toVO(DemoDeptDO demoDeptDO);

    Page<DemoDeptVO> toVO(Page<DemoDeptDO> page);

}
