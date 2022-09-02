package com.hank.simple2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @RequestMapping("/hello2")
    String hello2() {
        return "hello2";
    }
    @RequestMapping("/")
    String root() {
        return "index";
    }
}
