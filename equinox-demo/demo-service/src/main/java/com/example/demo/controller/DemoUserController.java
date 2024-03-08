package com.example.demo.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.api.DemoUserApi;
import com.example.demo.common.entity.DemoUserVO;
import com.example.demo.common.request.DemoUserPageRequest;
import com.example.demo.service.DemoUserService;
import com.github.isxuew.equinox.common.api.util.R;
import com.github.isxuew.equinox.common.data.request.IdRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class DemoUserController implements DemoUserApi {

    private final DemoUserService demoUserService;

    @Override
    public R<DemoUserVO> getById(IdRequest request) {
        DemoUserVO demoUserVO = demoUserService.getById(request);
        return R.ok(demoUserVO);
    }

    @Override
    public R<Page<DemoUserVO>> page(DemoUserPageRequest request) {
        Page<DemoUserVO> result = demoUserService.page(request);
        return R.ok(result);
    }

}
