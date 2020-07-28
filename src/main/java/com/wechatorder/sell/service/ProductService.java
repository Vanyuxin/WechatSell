package com.wechatorder.sell.service;

import com.wechatorder.sell.dataobject.ProductInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


import java.util.List;

/**
 * @author Yuxin
 * @date 2020/7/2713:49
 */
public interface ProductService {

    ProductInfo findOne(String productId);

    //查询所有在架商品列表
    //@return
    List<ProductInfo> findUpAll();

    Page<ProductInfo> findAll(Pageable pageable);

    ProductInfo save(ProductInfo productInfo);

    //加库存

    //减库存
}
