package com.wechatorder.sell.repository;

import com.wechatorder.sell.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**Create by Yuxin
 * 2020/07/26
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {
    @Autowired
    private ProductCategoryRepository repository;

    @Test
    public void findOneTest(){
        //直接输入1，“id：”是自动弹出的
        ProductCategory productCategory = repository.findOne(1);
        System.out.println(productCategory.toString());
    }
    @Test
    @Transactional
    public void saveTest(){
        //set2
        ProductCategory productCategory = new ProductCategory("男生最爱", 4);
        ProductCategory result = repository.save(productCategory);
        Assert.assertNotNull(result);
        //set
        //ProductCategory productCategory = new ProductCategory();
        //productCategory.setCategoryName("女生最爱");
        //productCategory.setCategoryType(3);
        //repository.save(productCategory);
        //更新1：类里面没有写时间，java无法获取表中的时间参数，动态更新的时间不受影响。
//        ProductCategory productCategory = new ProductCategory();
//        productCategory.setCategoryId(2);//更新与添加的差异
//        productCategory.setCategoryName("男生最爱");
//        productCategory.setCategoryType(3);
        //repository.save(productCategory);
        //更新2:假如类里面写了表中有需要动态更新的东西，比如时间，直接获取一条数据后，更新会导致时间无法更新，需要在类里面加DynamicUpdate组件
//        ProductCategory productCategory = repository.findOne(2);
//        productCategory.setCategoryType(3);//当需要修改的部分已存在的时候，spring会把本条记录原封不动地塞回去。
//        repository.save(productCategory);
    }

    @Test
    public void findByCategoryTypeInTest(){
        List<Integer> list = Arrays.asList(2,3,4);
        List<ProductCategory> result = repository.findByCategoryTypeIn(list);
        Assert.assertNotEquals(0, result.size());
    }
}