package com.project.booking.controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class LoginController {

    private static Logger logger  = LoggerFactory.getLogger(LoginController.class);

    @RequestMapping(value="/login", method=RequestMethod.GET)
    public String login(ModelMap map){
        return "login";
    }

    @RequestMapping(value= {"/loginfailed"}, method=RequestMethod.GET)
    public String loginError(ModelMap map){
        map.addAttribute("error", "true");
        return "login";
    }
}