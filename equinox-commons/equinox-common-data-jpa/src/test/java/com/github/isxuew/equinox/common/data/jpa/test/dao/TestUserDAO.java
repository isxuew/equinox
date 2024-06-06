package com.github.isxuew.equinox.common.data.jpa.test.dao;

import com.github.isxuew.equinox.common.data.BaseDAO;
import com.github.isxuew.equinox.common.data.jpa.test.entity.TestUserDO;
import com.github.isxuew.equinox.common.data.jpa.test.repository.TestUserRepository;
import org.springframework.stereotype.Repository;

@Repository
public class TestUserDAO extends BaseDAO<TestUserDO> {

    public TestUserDAO(TestUserRepository repository) {
        super(repository);
    }

}
