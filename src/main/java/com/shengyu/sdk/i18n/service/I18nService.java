package com.shengyu.sdk.i18n.service;

import java.util.Map;

public interface I18nService {
    /**
     * 通过国际化key获取国际化text
     *
     * @param text 国际化key
     * @return 国际化text
     */
    Map<String, String> getPropertyText(String text);
}
