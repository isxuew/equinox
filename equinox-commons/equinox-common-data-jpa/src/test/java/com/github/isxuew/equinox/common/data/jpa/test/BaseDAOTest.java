package com.github.isxuew.equinox.common.data.jpa.test;


import com.github.isxuew.equinox.common.data.jpa.test.dao.TestDeptDAO;
import com.github.isxuew.equinox.common.data.jpa.test.dao.TestUserDAO;
import com.github.isxuew.equinox.common.data.jpa.test.entity.TestUserDO;
import com.github.isxuew.equinox.common.data.jpa.test.repository.TestDeptRepository;
import com.github.isxuew.equinox.common.data.jpa.test.repository.TestUserRepository;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

public class BaseDAOTest extends BaseTest {

    @Autowired
    private TestUserDAO testUserDAO;
    @Autowired
    private TestDeptDAO testDeptDAO;
    @Autowired
    private TestUserRepository testUserRepository;
    @Autowired
    private TestDeptRepository testDeptRepository;


    @Test
    public void test() {
        testUserDAO.save(TestUserDO.builder().name("testUser").build());
        System.out.println(testUserRepository.findAllByNameLike("test%"));
    }

}
