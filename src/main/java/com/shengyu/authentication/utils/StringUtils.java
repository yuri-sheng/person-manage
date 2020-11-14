package com.shengyu.utils;

import java.util.ArrayList;
import java.util.List;

public class StringUtils {
    public static List<Integer> transform(List<String> list) {
        List<Integer> result = new ArrayList<>();
        if (list == null || list.size() == 0) {
            return result;
        }
        for (String str : list) {
            result.add(Integer.parseInt(str));
        }
        return result;
    }

    public static boolean nullOrEmpty(String str) {
        if (str == null || str.length() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean notBlank(String str) {
       return nullOrEmpty(str);
    }
}
