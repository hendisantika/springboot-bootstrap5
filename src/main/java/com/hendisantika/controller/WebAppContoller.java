package com.hendisantika.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;

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
}
