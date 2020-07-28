package com.wechatorder.sell.enums;

import lombok.Getter;

/**
 * 商品状态
 * @author Yuxin
 * @date 2020/7/2715:00
 */
@Getter
public enum ProductStatusEnum {

    UP(0, "在架"),
    DOWN(1, "下架")
    ;
    private Integer code;

    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
