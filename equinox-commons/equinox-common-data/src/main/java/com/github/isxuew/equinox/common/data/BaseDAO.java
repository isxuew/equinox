package com.github.isxuew.equinox.common.data;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

public class BaseDAO<M extends BaseMapper<T>, T> extends ServiceImpl<M, T> {

}
