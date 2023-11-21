package com.github.isxuew.equinox.common.api.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.Serial;
import java.io.Serializable;

import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;
import static org.springframework.http.HttpStatus.OK;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class R<T> implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private String requestId;

    private int code;

    private String message;

    private T data;

    public static <T> R<T> ok() {
        return init(OK.value(), OK.getReasonPhrase(), null);
    }

    public static <T> R<T> ok(T data) {
        return init(OK.value(), OK.getReasonPhrase(), data);
    }

    public static <T> R<T> fail() {
        return init(INTERNAL_SERVER_ERROR.value(), INTERNAL_SERVER_ERROR.getReasonPhrase(), null);
    }

    public static <T> R<T> fail(String message) {
        return init(INTERNAL_SERVER_ERROR.value(), message, null);
    }

    public static <T> R<T> init(int code, String message, T data) {
        return R.<T>builder().code(code).message(message).data(data).build();
    }

}
