package com.xss.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@RequestMapping("api/")
@Controller
public class TestTemplatesController {

    @RequestMapping(value = "getUser")
    public String getUser(){
        return "user";
    }




}
