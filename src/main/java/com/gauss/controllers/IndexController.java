package com.gauss.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@Controller
@RequestMapping("/")
class IndexController
{
    @RequestMapping(method = RequestMethod.GET)
    ModelAndView
    index()
    {
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("name", "Foster Z");
        return mav;
    }
}