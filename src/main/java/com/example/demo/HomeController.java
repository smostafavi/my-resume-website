package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class HomeController {

    @RequestMapping("/")
    public String home() {
        return "index";
    }

    @RequestMapping("/resume")
    public String about() {

        return "resume";
    }

    @RequestMapping("/workexperince")
    public String workexperince() {

        return "workexperince";
    }

    @RequestMapping("/education")
    public String education() {

        return "education";
    }
    @RequestMapping("/skills")
    public String skills() {

        return "skills";
    }
}



