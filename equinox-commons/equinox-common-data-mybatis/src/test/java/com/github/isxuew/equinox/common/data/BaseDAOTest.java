package com.github.isxuew.equinox.common.data;


import com.github.isxuew.equinox.common.data.mybatis.dao.TestDeptDAO;
import com.github.isxuew.equinox.common.data.mybatis.dao.TestUserDAO;
import com.github.isxuew.equinox.common.data.mybatis.entity.TestUser;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.Statement;
import java.util.List;

@RequiredArgsConstructor
public class BaseDAOTest extends BaseTest {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private TestDeptDAO testDeptDAO;
    @Autowired
    private TestUserDAO testUserDAO;

    @BeforeEach
    @SneakyThrows
    public void init() {
        Connection connection = dataSource.getConnection();
        Statement statement = connection.createStatement();
        String sql = """
                CREATE TABLE `test_user`  (
                  `id` bigint NOT NULL AUTO_INCREMENT,
                  `name` varchar(255) NULL,
                  `created_by` varchar(255) NULL,
                  `created_date_time` datetime NULL,
                  `updated_by` varchar(255) NULL,
                  `updated_date_time` datetime NULL,
                  PRIMARY KEY (`id`)
                );
                CREATE TABLE `test_dept`  (
                  `id` bigint NOT NULL AUTO_INCREMENT,
                  `name` varchar(255) NULL,
                  `created_by` varchar(255) NULL,
                  `created_date_time` datetime NULL,
                  `updated_by` varchar(255) NULL,
                  `updated_date_time` datetime NULL,
                  PRIMARY KEY (`id`)
                );
                """;
        statement.execute(sql);
        statement.close();
        connection.close();
    }

    @Test
    public void test() {
        TestUser testUser = new TestUser();
        testUserDAO.save(testUser);

        List<TestUser> list = testUserDAO.list();
        System.out.println(list);

        System.out.println(testDeptDAO.list());
    }

}
