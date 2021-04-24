package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author pandacoco
 */
@Controller
@RequestMapping("/home")
public class DemoController {

    @RequestMapping("/index")
    public String index() {
        return "index";
    }
}