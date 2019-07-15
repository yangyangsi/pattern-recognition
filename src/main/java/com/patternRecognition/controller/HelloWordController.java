package com.patternRecognition.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/patternRecognition")
@Controller
public class HelloWordController {
    @RequestMapping("/hello")
    public String helloWord(){
        return "index";
    }

}
