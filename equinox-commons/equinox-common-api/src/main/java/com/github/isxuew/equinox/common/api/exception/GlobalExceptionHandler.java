package com.github.isxuew.equinox.common.api.exception;

import com.github.isxuew.equinox.common.api.util.R;
import com.github.isxuew.equinox.common.core.exception.CheckedException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Optional;
import java.util.stream.Collectors;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    /**
     * 参数校验
     */
    @ExceptionHandler({BindException.class})
    public <T> R<T> bindExceptionHandler(BindException e) {
        String detail = e.getBindingResult()
                .getFieldErrors()
                .stream()
                .map(x -> Optional.ofNullable(x.getDefaultMessage()).orElse(x.getField()))
                .collect(Collectors.joining(", "));
        return R.fail("参数校验异常: " + detail);
    }

    /**
     * 校验 (assert)
     */
    @ExceptionHandler({IllegalArgumentException.class})
    public <T> R<T> illegalArgumentExceptionHandler(IllegalArgumentException e) {
        return R.fail(e.getMessage());
    }

    /**
     * 业务异常
     */
    @ExceptionHandler({CheckedException.class})
    public <T> ResponseEntity<R<T>> exception(CheckedException e) {
        return ResponseEntity.status(e.getHttpStatus()).body(R.init(e.getCode(), e.getMessage(), null));
    }

    /**
     * 全局异常
     */
    @ExceptionHandler({Exception.class})
    public <T> R<T> exception(Exception e) {
        log.error("globalException: {}", e.getMessage(), e);
        return R.fail(e.getMessage());
    }

}