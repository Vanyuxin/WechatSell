package com.wechatorder.sell.enums;

import lombok.Getter;

/**
 * @author Yuxin
 * @date 2020/7/2810:55
 */
@Getter
public enum ResultEnum {

    PARAM_ERROR(1,"参数不正确"),
    PRODUCT_NOT_EXIST(10, "商品不存在"),
    PRODUCT_STOCK_ERROR(11,"商品库存不正确"),
    ORDRE_NOT_EXIST(12, "订单不存在"),
    ORDREDETAIL_NOT_EXIST(12, "订单详情不存在"),
    ORDER_STATUS_ERROR(14,"订单状态不正确"),
    ORDER_UPDATE_FAIL(15,"订单更新失败"),
    ORDER_DETAIL_EMPTY(16,"订单详情为空"),
    ORDER_PAY_STATUS_ERROR(17,"订单支付状态不正确"),
    CART_EMPTY(18,"购物车为空"),
    ;

    private Integer code;

    private String messge;

    ResultEnum(Integer code, String messge) {
        this.code = code;
        this.messge = messge;
    }
}
