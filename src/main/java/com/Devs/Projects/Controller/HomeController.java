package com.Devs.Projects.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.awt.event.ActionListener;

@Controller
public class HomeController {
    @RequestMapping(value = {"", "/", "/home"})
    public String DisplayHomepage() {//
        return "home.html";
    }


}