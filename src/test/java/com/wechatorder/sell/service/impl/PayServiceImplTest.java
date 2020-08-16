package com.wechatorder.sell.service.impl;

import com.lly835.bestpay.service.impl.BestPayServiceImpl;
import com.wechatorder.sell.dto.OrderDTO;
import com.wechatorder.sell.service.OrderService;
import com.wechatorder.sell.service.PayService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @author Yuxin
 * @date 2020/8/3 18:09
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class PayServiceImplTest {

    @Autowired
    private PayServiceImpl PayService;

    @Autowired
    private OrderService orderService;

    @Test
    public void create() {
        OrderDTO orderDTO = orderService.findOne("1596046784696660944");
        PayService.create(orderDTO);
    }
}