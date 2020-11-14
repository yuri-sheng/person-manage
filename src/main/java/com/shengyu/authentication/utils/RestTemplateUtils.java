package com.shengyu.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class RestTemplateUtils {
    @Autowired
    private static RestTemplate restTemplate;

    public static String get(String url){
        String result = restTemplate.getForObject(url, String.class);
        return result;
    }
}
