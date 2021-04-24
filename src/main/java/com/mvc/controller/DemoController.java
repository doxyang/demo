package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author pandacoco
 */
@Controller
@RequestMapping("/home")
public class DemoController {

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index() {
        System.out.println("hello index");
        return "index";
    }
}