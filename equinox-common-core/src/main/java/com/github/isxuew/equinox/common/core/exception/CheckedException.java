package com.github.isxuew.equinox.common.core.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.http.HttpStatus;

import java.io.Serial;

@Data
@EqualsAndHashCode(callSuper = true)
public class CheckedException extends RuntimeException {

    @Serial
    private static final long serialVersionUID = 1L;

    private int code = HttpStatus.INTERNAL_SERVER_ERROR.value();

    private int httpStatus = HttpStatus.INTERNAL_SERVER_ERROR.value();

    public CheckedException() {
        super();
    }

    public CheckedException(String message) {
        super(message);
    }

    public CheckedException(int code, String message) {
        super(message);
        this.code = code;
    }

    public CheckedException(String message, int httpStatus) {
        super(message);
        this.httpStatus = httpStatus;
    }

    public CheckedException(int code, String message, int httpStatus) {
        super(message);
        this.code = code;
        this.httpStatus = httpStatus;
    }

}
