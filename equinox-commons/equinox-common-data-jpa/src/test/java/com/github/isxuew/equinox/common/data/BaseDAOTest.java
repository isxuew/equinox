package com.github.isxuew.equinox.common.data;


import com.github.isxuew.equinox.common.data.jpa.dao.TestDeptDAO;
import com.github.isxuew.equinox.common.data.jpa.dao.TestUserDAO;
import com.github.isxuew.equinox.common.data.jpa.entity.TestUser;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BaseDAOTest extends BaseTest {

    @Autowired
    private TestDeptDAO testDeptDAO;
    @Autowired
    private TestUserDAO testUserDAO;

    @Test
    public void test() {
        List<TestUser> list = testUserDAO.findAll();
        System.out.println(list);
    }

}
