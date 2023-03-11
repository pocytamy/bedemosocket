package com.demo;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

@Controller
    public class GreetingController {


    @MessageMapping("/hello")
    @SendTo("/topic/hi")
    public Hello greeting(User user) throws Exception {
        Thread.sleep(1000); // simulated delay
        return new Hello("Hello, " + user.getName() + "!");
    }
}