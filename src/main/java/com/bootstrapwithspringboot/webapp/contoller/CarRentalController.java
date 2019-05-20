package com.bootstrapwithspringboot.webapp.contoller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CarRentalController {

    @GetMapping("/carrental")
    public String carrental(){return "carrental";}


}
