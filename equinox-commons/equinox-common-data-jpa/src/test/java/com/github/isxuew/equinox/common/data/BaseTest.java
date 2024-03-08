package com.github.isxuew.equinox.common.data;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootTest
public abstract class BaseTest {

    @SpringBootApplication
    @EnableJpaRepositories
    public static class TestApplication {

    }

}
