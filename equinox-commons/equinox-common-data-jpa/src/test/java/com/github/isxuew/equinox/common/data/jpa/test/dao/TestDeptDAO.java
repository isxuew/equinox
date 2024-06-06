package com.github.isxuew.equinox.common.data.jpa.test.dao;

import com.github.isxuew.equinox.common.data.BaseDAO;
import com.github.isxuew.equinox.common.data.jpa.test.entity.TestDeptDO;
import com.github.isxuew.equinox.common.data.jpa.test.repository.TestDeptRepository;
import org.springframework.stereotype.Repository;

@Repository
public class TestDeptDAO extends BaseDAO<TestDeptDO> {

    public TestDeptDAO(TestDeptRepository repository) {
        super(repository);
    }

}
