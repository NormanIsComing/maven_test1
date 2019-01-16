package com.media.controller;

import com.media.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Author: 张子锋
 * @Date: 2018/12/26 23:25
 * @Description:
 */
@Controller
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping(value="/Hello")
    public String HelloWorld(Model model){
        testService.download();
        model.addAttribute("message","Hello World!!!!!!");
        model.addAttribute("a", "aaaaa");
        return "HelloWorld";
    }

    @RequestMapping(value = {"/", "/welcom**"}, method = RequestMethod.GET)
    public ModelAndView welcomPage(){
        ModelAndView model = new ModelAndView();
        model.addObject("title", "Spring Security Hello World");
        model.addObject("message", "This is welcome page!");
        model.setViewName("hello");
        return model;
    }

    @RequestMapping(value = "/admin**", method = RequestMethod.GET)
    public ModelAndView adminPage() {
        ModelAndView model = new ModelAndView();
        model.addObject("title", "Spring Security Hello World");
        model.addObject("message", "This is protected page!");
        model.setViewName("admin");
        return model;
    }
}
