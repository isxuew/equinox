package com.github.isxuew.equinox.common.data.jpa.test.repository;


import com.github.isxuew.equinox.common.data.jpa.repository.BaseRepository;
import com.github.isxuew.equinox.common.data.jpa.test.entity.TestUserDO;

import java.util.List;

public interface TestUserRepository extends BaseRepository<TestUserDO> {

    public List<TestUserDO> findAllByNameLike(String name);

}
