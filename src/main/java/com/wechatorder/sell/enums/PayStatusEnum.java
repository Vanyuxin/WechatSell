package com.wechatorder.sell.enums;

import lombok.Getter;
import org.aopalliance.reflect.Code;

/**
 * @author Yuxin
 * @date 2020/7/2721:04
 */
@Getter
public enum PayStatusEnum implements CodeEnum {
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
