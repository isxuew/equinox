package com.github.isxuew.equinox.common.data.jpa.dao;

import com.github.isxuew.equinox.common.data.BaseDAO;
import com.github.isxuew.equinox.common.data.jpa.entity.TestDept;
import com.github.isxuew.equinox.common.data.jpa.repository.TestDeptRepository;
import org.springframework.stereotype.Service;

@Service
public class TestDeptDAO extends BaseDAO<TestDept> {

    public TestDeptDAO(TestDeptRepository repository) {
        super(repository);
    }

}
