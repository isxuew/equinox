package com.github.isxuew.equinox.common.data;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.data.domain.Persistable;

public class BaseDAO<T extends Persistable<Long>> extends ServiceImpl<BaseMapper<T>, T> {

}
