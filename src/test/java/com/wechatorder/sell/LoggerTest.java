package com.wechatorder.sell;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

//create by:Fyuxin
//2020/7/19
@RunWith(SpringRunner.class)
@SpringBootTest
//导入lombok类，简化代码输入 logger 变log
@Slf4j
public class LoggerTest {
    //这里输出的时候要写当前类的类名以方便输出后区分所在的类，可以通过
    private final Logger logger = LoggerFactory.getLogger(LoggerTest.class);
    @Test

    public void test1(){
        log.debug("debug...");
        log.info("info...");
        log.error("error...");
        //日志输出变量
        String name = "wechat";
        String password = "123456";
        log.info("name: {}, password: {}", name, password);
    }

}
