package com.wechatorder.sell.service;

import com.lly835.bestpay.model.PayResponse;
import com.lly835.bestpay.model.RefundResponse;
import com.wechatorder.sell.dto.OrderDTO;
import org.hibernate.criterion.Order;

/**
 * 支付
 * @author Yuxin
 * @date 2020/8/3 17:18
 */
public interface PayService {

    PayResponse create(OrderDTO orderDTO);

    PayResponse notify(String notifyData);

    RefundResponse refund(OrderDTO orderDTO);
}
