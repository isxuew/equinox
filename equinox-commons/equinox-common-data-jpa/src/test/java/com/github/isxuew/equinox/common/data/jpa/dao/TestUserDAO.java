package com.github.isxuew.equinox.common.data.jpa.dao;

import com.github.isxuew.equinox.common.data.BaseDAO;
import com.github.isxuew.equinox.common.data.jpa.entity.TestUser;
import com.github.isxuew.equinox.common.data.jpa.repository.TestUserRepository;
import org.springframework.stereotype.Service;

@Service
public class TestUserDAO extends BaseDAO<TestUser> {

    public TestUserDAO(TestUserRepository repository) {
        super(repository);
    }

}
