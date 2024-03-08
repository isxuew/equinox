package com.example.demo.common.entity;

import com.github.isxuew.equinox.common.data.entity.BaseDateEntity;
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
@Schema(description = "DemoDept对象")
public class DemoDeptVO extends BaseDateEntity {

    @Schema(description = "父级")
    private Long parentId;

    @Schema(description = "路径")
    private String path;

    @Schema(description = "部门名称")
    private String name;

    @Schema(description = "部门描述")
    private String description;

}