package com.github.isxuew.equinox.common.api.exception;

import com.github.isxuew.equinox.common.api.util.R;
import com.github.isxuew.equinox.common.core.exception.CheckedException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Optional;
import java.util.stream.Collectors;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    /**
     * 业务异常
     */
    @ExceptionHandler({CheckedException.class})
    public ResponseEntity<R> exception(CheckedException e) {
        log.error("checkedException: {}", e.getMessage(), e);
        return ResponseEntity.status(e.getHttpStatus()).body(R.init(e.getCode(), e.getMessage(), null));
    }

    /**
     * 全局异常
     */
    @ExceptionHandler({Exception.class})
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public R exception(Exception e) {
        log.error("globalException: {}", e.getMessage(), e);
        return R.fail(e.getMessage());
    }

    /**
     * 参数绑定
     */
    @ExceptionHandler({BindException.class})
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public R bindExceptionHandler(BindException e) {
        String detail = e.getBindingResult()
                .getFieldErrors()
                .stream()
                .map(x -> Optional.ofNullable(x.getDefaultMessage()).orElse(x.getField()))
                .collect(Collectors.joining(", "));
        log.warn("bindException: {}", detail, e);
        return R.fail("参数绑定异常: " + detail);
    }

    /**
     * 校验 (assert)
     */
    @ExceptionHandler({IllegalArgumentException.class})
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public R illegalArgumentExceptionHandler(IllegalArgumentException e) {
        log.warn("illegalArgumentException: {}", e.getMessage(), e);
        return R.fail(e.getMessage());
    }

}
