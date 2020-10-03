package com.hh.jpa.controller;

import com.hh.jpa.pojo.Uuser1;
import com.hh.jpa.service.UuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UuserService uuserService;

    @RequestMapping(value = "/findFirstUser", method = RequestMethod.GET)
    @ResponseBody
    public Uuser1 findUuser1() {
        return uuserService.getUserByUUID();
    }

    @RequestMapping(value = "/findShowNameUser", method = RequestMethod.GET)
    @ResponseBody
    public Uuser1 findShowNameUuser1() {
        return uuserService.getUserByExample();
    }

    @RequestMapping(value = "/findUserByShowName/{showName}", method = RequestMethod.GET)
    @ResponseBody
    public Uuser1 findUserByShowName(@PathVariable String showName) {
        return uuserService.getUserByQuery(showName);
    }

    @RequestMapping(value = "/findUserByParam/{showName}", method = RequestMethod.GET)
    @ResponseBody
    public Uuser1 findUserByParam(@PathVariable String showName) {
        return uuserService.getUserByParam(showName);
    }

}
