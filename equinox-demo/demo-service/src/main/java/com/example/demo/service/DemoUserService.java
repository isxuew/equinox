package com.example.demo.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.common.converter.DemoUserConverter;
import com.example.demo.common.entity.DemoUserDO;
import com.example.demo.common.entity.DemoUserVO;
import com.example.demo.common.request.DemoUserPageRequest;
import com.example.demo.data.dao.DemoUserDAO;
import com.github.isxuew.equinox.common.data.request.IdRequest;
import com.github.isxuew.equinox.common.data.util.PageUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DemoUserService {

    private final DemoUserDAO demoUserDAO;
    private final DemoUserConverter demoUserConverter;

    public DemoUserVO getById(IdRequest request) {
        DemoUserDO demoUserDO = demoUserDAO.getById(request.getId());
        DemoUserVO demoUserVO = demoUserConverter.toVO(demoUserDO);
        return demoUserVO;
    }

    public Page<DemoUserVO> page(DemoUserPageRequest request) {
        LambdaQueryWrapper<DemoUserDO> wrapper = Wrappers.lambdaQuery();
        Page<DemoUserVO> page = demoUserConverter.toVO(demoUserDAO.page(PageUtil.of(request), wrapper));
        return page;
    }

}
