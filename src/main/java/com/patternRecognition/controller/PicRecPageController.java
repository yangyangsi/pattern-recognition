package com.patternRecognition.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/page")
@Controller
public class PicRecPageController {
    @RequestMapping("/homePage")
    public String homePage(){
        return "homePage";
    }
}
