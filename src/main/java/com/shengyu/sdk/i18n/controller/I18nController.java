package com.shengyu.sdk.i18n.controller;

import com.shengyu.sdk.i18n.service.I18nService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/i18n")
public class I18nController {

    @Autowired
    I18nService i18nService;
    @RequestMapping("/")
    public Map<String, String> getPropertyText(String text) {
        return i18nService.getPropertyText(text);
    }
}
