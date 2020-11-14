package com.shengyu.sdk.i18n.service.impl;

import com.shengyu.sdk.i18n.dao.I18nDao;
import com.shengyu.sdk.i18n.service.I18nService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class I18nServiceImpl implements I18nService {
    @Autowired
    private I18nDao I18nDao;
    public Map<String, String> getPropertyText(String text){
        return I18nDao.getPropertyText(text);
    }
}
