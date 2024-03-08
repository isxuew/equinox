package com.github.isxuew.equinox.common.data.util;

import cn.hutool.core.util.ArrayUtil;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.github.isxuew.equinox.common.data.request.PageRequest;

public class PageUtil {

    public static <P extends PageRequest, T> Page<T> of(P request) {
        return Page.of(request.getPageNumber(), request.getPageSize());
    }

    public static <P extends PageRequest, T> Page<T> of(P request, Class<T> clazz) {
        Page<T> page = Page.of(request.getPageNumber(), request.getPageSize());
        if (ArrayUtil.isNotEmpty(request.getOrders())) {
            // todo 校验字段
        }
        return page;
    }

}
