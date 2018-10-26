package com.shiro.demoshiro.controller;

import com.shiro.demoshiro.config.BaseApiService;
import com.shiro.demoshiro.config.ResponseBase;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/user/")
@RestController
public class UserController {


    @RequestMapping("/index")
    public ResponseBase index() {
        return BaseApiService.setResultSuccess("我来到了用户页面");
    }
}
