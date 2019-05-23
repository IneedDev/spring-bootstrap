package com.bootstrapwithspringboot.webapp;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/home").setViewName("carrental");
        registry.addViewController("/").setViewName("index");
        registry.addViewController("/hello").setViewName("carrentallogin");
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/carrentallogin").setViewName("carrentallogin");
        registry.addViewController("/carrentalapp").setViewName("carrentalapp");

    }

}