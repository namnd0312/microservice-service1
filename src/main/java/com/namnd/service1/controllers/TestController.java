package com.namnd.service1.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author nam.nd
 * @created 21/02/2021 - 2:44 PM
 */

@RestController
public class TestController {
    @RequestMapping("/")
    public String sayHello(){
        return "Hello Namnd - welcome to service-1!";
    }
}
