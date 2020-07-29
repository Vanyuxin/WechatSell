package com.wechatorder.sell.dto;

import com.wechatorder.sell.dataobject.OrderDetail;
import com.wechatorder.sell.enums.OrderStatusEnum;
import com.wechatorder.sell.enums.PayStatusEnum;
import lombok.Data;

import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @author Yuxin
 * @date 2020/7/2810:39
 */
@Data
public class OrderDTO {
    //订单id
    private String orderId;

    //买家名字
    private String buyerName;

    //买家手机号
    private String buyerPhone;

    //买家地址
    private String buyerAddress;

    //买家微信Openid
    private String buyerOpenid;

    //订单总金额
    private BigDecimal orderAmount;

    //订单状态，默认为新下单
    private Integer orderStatus;

    //支付状态，默认为0未支付
    private Integer payStatus;

    //创建时间
    private Date createTime;

    //更新时间
    private Date updateTime;

    List<OrderDetail> orderDetailList;
}
