package com.wechatorder.sell.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 *类目
 *Create by Yuxin
 *2020/07/26
 */
@Entity
@DynamicUpdate//用于时间动态更新
@Data
public class ProductCategory {
    /** 类目id. */
    @Id
    @GeneratedValue
    private Integer categoryId;
    /**类目名字*/
    private String categoryName;
    /**类目编号*/
    private Integer categoryType;

    public ProductCategory() {
    }

    public ProductCategory(String categoryName, Integer categoryType) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }
//alt+Insert 自动插入，用lombok包替代gettings and settings
//    public Integer getCategoryId() {
//        return categoryId;
//    }
}
