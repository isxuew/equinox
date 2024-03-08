package com.example.demo.api;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.common.entity.DemoUserVO;
import com.example.demo.common.request.DemoUserPageRequest;
import com.github.isxuew.equinox.common.api.util.R;
import com.github.isxuew.equinox.common.data.request.IdRequest;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface DemoUserApi {

    @PostMapping("/user/getById")
    public R<DemoUserVO> getById(@RequestBody @Validated IdRequest request);

    @PostMapping("/user/page")
    public R<Page<DemoUserVO>> page(@RequestBody @Validated DemoUserPageRequest request);

}
