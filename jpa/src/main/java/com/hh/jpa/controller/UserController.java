package com.hh.jpa.controller;

import com.hh.jpa.pojo.Uuser1;
import com.hh.jpa.service.UuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UuserService uuserService;

    @RequestMapping(value = "/findFirstUser", method = RequestMethod.GET)
    @ResponseBody
    public Uuser1 getUuser1() {
        return uuserService.getUserByUUID();
    }

}
