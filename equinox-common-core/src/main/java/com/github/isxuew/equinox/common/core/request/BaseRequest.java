package com.github.isxuew.equinox.common.core.request;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.Serial;
import java.io.Serializable;

@Data
@SuperBuilder
@NoArgsConstructor
public class BaseRequest implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

}
