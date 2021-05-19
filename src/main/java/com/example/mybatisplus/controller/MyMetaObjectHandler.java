package com.example.mybatisplus.controller;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * @author Chen
 */
@Component
public class MyMetaObjectHandler implements MetaObjectHandler {


    @Override
    public void insertFill(MetaObject metaObject) {
        boolean hasGmtCreate = metaObject.hasSetter("gmtCreate");
        boolean hasGmtModified = metaObject.hasSetter("gmtModified");
        if (hasGmtCreate) {
            Object gmtCreate = this.getFieldValByName("gmtCreate", metaObject);
            if (gmtCreate == null) {
                this.strictInsertFill(metaObject, "gmtCreate", LocalDateTime.class, LocalDateTime.now());
            }
        }
        if (hasGmtModified) {
            Object gmtModified = this.getFieldValByName("gmtModified", metaObject);
            if (gmtModified == null) {
                this.strictInsertFill(metaObject, "gmtModified", LocalDateTime.class, LocalDateTime.now());
            }
        }
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        boolean hasGmtModified = metaObject.hasSetter("gmtModified");
        if (hasGmtModified) {
            Object gmtModified = this.getFieldValByName("gmtModified", metaObject);
            if (gmtModified == null) {
                this.strictInsertFill(metaObject, "gmtModified", LocalDateTime.class, LocalDateTime.now());
            }
        }
    }
}