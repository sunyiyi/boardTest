package com.yz.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/hello")

public class HelloController {

    @GetMapping("/helloTest")
    public ModelAndView hello(ModelMap modelMap){

        return new ModelAndView("helloT");
    }
    @GetMapping("/helloTest2")
    public String hello2(ModelMap modelMap){

        return "/helloT";
    }

}
