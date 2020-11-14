package com.shengyu.sdk.errorcode;

import com.shengyu.authentication.utils.StringUtils;

import java.util.HashMap;
import java.util.Map;

public class ErrorCodeUtils {
    public static ErrorCode getErrorCode(String key) {
        if (StringUtils.nullOrEmpty(key)) {
            return new ErrorCode("","");
        }
        //todo:从数据库根据Key查询放在result中
        Map<String, String> result = new HashMap<>();
        return new ErrorCode(key, result.get(key));
    }
}
