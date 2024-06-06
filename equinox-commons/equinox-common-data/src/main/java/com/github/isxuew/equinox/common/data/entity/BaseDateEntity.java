package com.github.isxuew.equinox.common.data.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.querydsl.core.annotations.QueryExclude;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serial;
import java.time.LocalDateTime;

@Data
@SuperBuilder
@QueryExclude
@MappedSuperclass
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class BaseDateEntity extends BaseEntity {

    @Serial
    private static final long serialVersionUID = 1L;

    @Schema(description = "创建人")
    @CreatedBy
    @TableField(fill = FieldFill.INSERT)
    @Column(updatable = false, columnDefinition = "varchar(255) COMMENT '创建人'")
    protected String createdBy;

    @Schema(description = "创建时间")
    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
    @TableField(fill = FieldFill.INSERT)
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(updatable = false, columnDefinition = "datetime COMMENT '创建时间'")
    protected LocalDateTime createdDateTime;

    @Schema(description = "更新人")
    @LastModifiedBy
    @TableField(fill = FieldFill.INSERT_UPDATE)
    @Column(columnDefinition = "varchar(255) COMMENT '更新人'")
    protected String updatedBy;

    @Schema(description = "更新时间")
    @LastModifiedDate
    @Temporal(TemporalType.TIMESTAMP)
    @TableField(fill = FieldFill.INSERT_UPDATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(columnDefinition = "datetime COMMENT '更新时间'")
    protected LocalDateTime updatedDateTime;

}
