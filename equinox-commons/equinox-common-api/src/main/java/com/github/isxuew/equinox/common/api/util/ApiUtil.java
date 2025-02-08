package com.github.isxuew.equinox.common.api.util;

import com.github.isxuew.equinox.common.core.exception.CheckedException;
import org.springframework.http.HttpStatus;

import java.util.Objects;
import java.util.Optional;

public class ApiUtil {

    public static <T> boolean isOK(R<T> response) {
        return Objects.nonNull(response) && HttpStatus.valueOf(response.getCode()).is2xxSuccessful();
    }

    public static <T> boolean checkOK(R<T> response) {
        return checkOK(response, "响应体为空");
    }

    public static <T> boolean checkOK(R<T> response, String message) {
        if (Objects.isNull(response)) {
            throw new CheckedException(message);
        }
        if (HttpStatus.valueOf(response.getCode()).is2xxSuccessful()) {
            return true;
        }
        throw new CheckedException("响应码：" + response.getCode() + "，" + response.getMessage());
    }

    public static <T> Optional<T> getData(R<T> response) {
        return isOK(response) ? Optional.of(response.getData()) : Optional.empty();
    }

    public static <T> Optional<T> getData(R<T> response, String message) {
        checkOK(response, message);
        return Optional.ofNullable(response.getData());
    }

}
