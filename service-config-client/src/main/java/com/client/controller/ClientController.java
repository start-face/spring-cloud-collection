package com.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author FaceFeel
 * @Created 2018-05-25 15:38
 **/
@RestController
public class ClientController {

    @Value("${foo}")
    String foo;

    @RequestMapping("/hi")
    public String foo() {
        return foo;
    }
}
