package com.wechatorder.sell.service;

import com.wechatorder.sell.dto.OrderDTO;

/**
 * 买家
 * @author Yuxin
 * @date 2020/7/30 23:36
 */
public interface BuyerService {
    //查询一个订单
    OrderDTO findOrderOne(String openid, String orderId);

    //取消订单
    OrderDTO cancelOrder(String openid, String orderId);

}
