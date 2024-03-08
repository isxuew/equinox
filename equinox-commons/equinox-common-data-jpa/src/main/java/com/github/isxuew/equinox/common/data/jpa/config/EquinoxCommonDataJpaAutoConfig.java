package com.github.isxuew.equinox.common.data.jpa.config;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@AutoConfiguration
@EnableJpaAuditing
@EnableJpaRepositories
public class EquinoxCommonDataJpaAutoConfig {

}
