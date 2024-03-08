//package com.example.demo;
//
//import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
//import com.example.demo.common.entity.DemoUserVO;
//import com.example.demo.common.request.DemoUserPageRequest;
//import com.example.demo.service.DemoUserService;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//@SpringBootTest
//public class DemoApplicationTest {
//
//    @Autowired
//    private DemoUserService demoUserService;
//
//    @Test
//    void contextLoads() {
//
//        DemoUserPageRequest request = new DemoUserPageRequest();
//        request.setPageNumber(1);
//        request.setPageSize(3);
//
//        Page<DemoUserVO> page = demoUserService.page(request);
//
//        for (DemoUserVO record : page.getRecords()) {
//            System.out.println(record.getId());
//        }
//
//    }
//
//}