package com.orichalcoss.utils;

import java.util.ArrayList;
import java.util.List;

public class StringUtils {
    public static List<Integer> transform(List<String> list){
        List<Integer> result = new ArrayList<Integer>();
        if(list == null || list.size() == 0){
            return result;
        }
        for(String str : list){
            result.add(Integer.parseInt(str));
        }
        return result;
    }
}
