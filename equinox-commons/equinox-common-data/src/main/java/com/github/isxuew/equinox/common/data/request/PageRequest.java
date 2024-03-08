package com.github.isxuew.equinox.common.data.request;

import cn.hutool.db.sql.Order;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Schema(description = "PageRequest")
public class PageRequest extends BaseRequest {

    @Schema(description = "页码", defaultValue = "1")
    private int pageNumber = 1;

    @Schema(description = "每页结果数", defaultValue = "20")
    private int pageSize = 20;

    @Schema(description = "排序条件")
    private Order[] orders;

}
