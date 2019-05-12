package com.bootstrapwithspringboot.webapp;

import com.bootstrapwithspringboot.webapp.contoller.WebAppContoller;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses= WebAppContoller.class)
public class WebappApplication {

    public static void main(String[] args) {

        SpringApplication.run(WebappApplication.class, args);
    }

}
