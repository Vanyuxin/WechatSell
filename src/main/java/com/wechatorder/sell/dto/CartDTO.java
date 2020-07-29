package com.wechatorder.sell.dto;

import lombok.Data;

/**
 * 购物车
 * @author Yuxin
 * @date 2020/7/28 11:18
 */
@Data
public class CartDTO {

    //商品Id.
    private String productId;

    //数量.
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
