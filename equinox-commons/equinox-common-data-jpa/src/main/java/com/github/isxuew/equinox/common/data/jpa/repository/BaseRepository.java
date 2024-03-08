package com.github.isxuew.equinox.common.data.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface BaseRepository<T> extends QuerydslPredicateExecutor<T>, JpaRepository<T, Long> {

}
