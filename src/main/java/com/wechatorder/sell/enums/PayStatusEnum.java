package com.wechatorder.sell.enums;

import lombok.Getter;

/**
 * @author Yuxin
 * @date 2020/7/2721:04
 */
@Getter
public enum PayStatusEnum {
    WAIT(0, "等待支付"),
    SUCCESS(1, "支付成功"),
    ;

    private Integer code;

    private String message;

    PayStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
