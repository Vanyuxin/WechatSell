package com.wechatorder.sell.service.impl;

import com.wechatorder.sell.dataobject.ProductInfo;
import com.wechatorder.sell.enums.ProductStatusEnum;
import com.wechatorder.sell.repository.ProductinfoRepository;
import com.wechatorder.sell.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


import java.util.List;

/**
 * @author Yuxin
 * @date 2020/7/2713:53
 */
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductinfoRepository repository;

    @Override
    public ProductInfo findOne(String productId) {
        return repository.findOne(productId);
    }

    @Override
    public List<ProductInfo> findUpAll() {
        return repository.findByProductStatus(ProductStatusEnum.UP.getCode());
    }

    @Override
    public Page<ProductInfo> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public ProductInfo save(ProductInfo productInfo) {
        return repository.save(productInfo);
    }
}
