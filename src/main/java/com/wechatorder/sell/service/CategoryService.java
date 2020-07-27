package com.wechatorder.sell.service;

import com.wechatorder.sell.dataobject.ProductCategory;

import java.util.List;

/**类目
 * Created by Yuin
 * 2020/07/26
 */
public interface CategoryService {
    ProductCategory findOne(Integer categoryId);
    List<ProductCategory> findAll();
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
    ProductCategory save(ProductCategory productCategory);
}
