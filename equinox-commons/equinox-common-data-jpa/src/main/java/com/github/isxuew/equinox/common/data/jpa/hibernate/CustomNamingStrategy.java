package com.github.isxuew.equinox.common.data.jpa.hibernate;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.util.StrUtil;
import org.hibernate.boot.model.naming.Identifier;
import org.hibernate.boot.model.naming.PhysicalNamingStrategyStandardImpl;
import org.hibernate.engine.jdbc.env.spi.JdbcEnvironment;

import java.io.Serializable;
import java.util.Collection;
import java.util.Set;

public class CustomNamingStrategy extends PhysicalNamingStrategyStandardImpl implements Serializable {

    private static final String SPLIT = "_";

    private final String prefix;

    private final Set<String> ignorePrefixes = CollUtil.newHashSet();

    private final Set<String> ignoreSuffixes = CollUtil.newHashSet("do", "entity");

    public CustomNamingStrategy() {
        this(null, null, null);
    }

    public CustomNamingStrategy(String prefix, Collection<String> ignorePrefixes, Collection<String> ignoreSuffixes) {
        this.prefix = prefix;
        if (ignorePrefixes != null) {
            this.ignorePrefixes.addAll(ignorePrefixes);
        }
        if (ignoreSuffixes != null) {
            this.ignoreSuffixes.addAll(ignoreSuffixes);
        }
    }

    @Override
    public Identifier toPhysicalTableName(Identifier name, JdbcEnvironment context) {
        return new Identifier(getName(name.getText()), name.isQuoted());
    }

    @Override
    public Identifier toPhysicalColumnName(Identifier name, JdbcEnvironment context) {
        return new Identifier(StrUtil.toUnderlineCase(name.getText()), name.isQuoted());
    }

    public String getName(String name) {
        // 忽略前缀
        if (!ignorePrefixes.isEmpty()) {
            for (String s : ignorePrefixes) {
                if (StrUtil.startWithIgnoreCase(name, s)) {
                    name = StrUtil.removePrefixIgnoreCase(name, s);
                }
            }
        }
        // 忽略后缀
        if (!ignoreSuffixes.isEmpty()) {
            for (String s : ignoreSuffixes) {
                if (StrUtil.endWithIgnoreCase(name, s)) {
                    name = StrUtil.removeSuffixIgnoreCase(name, s);
                }
            }
        }
        // 转换为下划线方案
        name = StrUtil.toUnderlineCase(name);
        // 加自定义前缀
        if (StrUtil.isNotBlank(prefix)) {
            name = prefix + SPLIT + name;
        }
        return name;
    }

}
