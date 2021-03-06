package com.noyss.app.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MainController {

    private static Logger LOGGER = LoggerFactory.getLogger(MainController.class);

    @GetMapping("/")
    public String main(){
        LOGGER.info("main");
        return "main";
    }
}
