package com.wechatorder.sell.exception;

import com.wechatorder.sell.enums.ResultEnum;

/**
 * @author Yuxin
 * @date 2020/7/2810:54
 */
public class SellException extends RuntimeException{

    private  Integer code;

    public SellException(ResultEnum resultEnum){
        super(resultEnum.getMessge());

        this.code = resultEnum.getCode();
    }

    public SellException(Integer code, String message) {
        super(message);
        this.code = code;
    }
}
