package com.wechatorder.sell.utils;

import com.wechatorder.sell.enums.CodeEnum;

/**
 * @author Yuxin
 * @date 2020/8/15 21:46
 */
public class EnumUtil {

    public static <T extends CodeEnum> T getByCode(Integer code, Class<T> enumClass){
        for (T each: enumClass.getEnumConstants()){
            if(code.equals((each.getCode()))){
                return each;
            }
        }
        return null;
    }
}
