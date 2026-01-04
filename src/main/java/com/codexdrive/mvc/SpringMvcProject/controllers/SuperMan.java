package com.codexdrive.mvc.SpringMvcProject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping
public class SuperMan {
    /*
    /about
    @RequestMapping is used for mapping the url with method
     */
    @RequestMapping("/about")
    public String aboutRequestHandler() {
        System.out.println("Processing about request");
        return "about";
    }

    @RequestMapping("/services")
    public String serviceRequestHandler() {
        System.out.println("Processing about request");
        return "services";
    }
}