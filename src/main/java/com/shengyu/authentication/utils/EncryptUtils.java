package com.shengyu.utils;

import com.google.common.base.Suppliers;
import org.springframework.util.DigestUtils;

import java.security.MessageDigest;
import java.util.function.Supplier;

public class EncryptUtils {
    private static Supplier<EncryptUtils> HOLDER = Suppliers.memoize(EncryptUtils :: new);

    public static EncryptUtils getInstance() {
        return HOLDER.get();
    }

    /**
     * 盐值
     */
    private static final String slat = "&%1A2Asc*&%$$#@";
    /**
     * 原生的加密方法
     *
     * @param value 需要加密的字符串
     * @return 加密后的字符串
     */
    public String md5(String value) {
        try {
            value = value + slat;
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(value.getBytes("UTF8"));
            byte message[] = messageDigest.digest();
            String result = "";
            for (int i = 0; i < message.length; i++) {
                result += Integer.toHexString((0x000000FF & message[i]) | 0xFFFFFF00).substring(6);
            }
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * spring框架里面的加密方法
     *
     * @param value 需要加密的字符串
     * @return 加密后的字符串
     */
    public String getMD5(String value) {
        String base = value + "/s/" + slat;
        return DigestUtils.md5DigestAsHex(base.getBytes());
    }

}
