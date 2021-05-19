package com.example.mybatisplus.entity;

import com.baomidou.mybatisplus.annotation.Version;
import lombok.Data;

/**
 * @author Chen
 */
@Data
public class Shop {

    private Long id;

    private String name;

    private Integer price;

    @Version
    private Integer version;
}
