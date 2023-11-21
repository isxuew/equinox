package com.github.isxuew.equinox.common.api.util;

import java.util.Objects;

import static org.springframework.http.HttpStatus.OK;

public class ApiUtil {

    public static boolean isOK(R response) {
        return Objects.nonNull(response) && response.getCode() == OK.value();
    }

    public static boolean hasData(R response) {
        return Objects.nonNull(response.getData());
    }

}
