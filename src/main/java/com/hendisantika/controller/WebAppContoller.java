package com.hendisantika.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-bootstrap5
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 05/09/21
 * Time: 17.18
 */
@Controller
public class WebAppContoller {
    private final String appMode;

    @Autowired
    public WebAppContoller(Environment environment) {
        appMode = environment.getProperty("app-mode");
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("datetime", new Date());
        model.addAttribute("username", "@hendisantika34");
        model.addAttribute("projectname", "WebApp");
        model.addAttribute("mode", appMode);

        return "index";
    }
}
