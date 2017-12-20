package com.liumapp.test.module.core.controller;

import com.liumapp.test.module.util.entity.Guest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liumapp on 12/19/17.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
@RestController
@RequestMapping(path = "/")
public class IndexController {

    @Autowired
    private Guest guest;

    @RequestMapping(path = "/")
    public String index(){
        return "success" + guest.getAppKey();
    }

}
