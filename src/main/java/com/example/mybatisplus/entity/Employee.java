package com.example.mybatisplus.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author Chen
 */
@Data
@TableName("tbl_employee")
public class Employee {

    private Long id;

    private String lastName;

    private String email;

    private Integer age;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime gmtCreate;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime gmtModified;

    /**
     * 逻辑删除属性
     */
    @TableLogic
    @TableField(value = "is_deleted")
    private Integer deleted;
}
