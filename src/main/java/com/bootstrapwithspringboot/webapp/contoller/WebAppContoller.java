
package com.bootstrapwithspringboot.webapp.contoller;

import com.bootstrapwithspringboot.webapp.model.CalcResult;
import com.bootstrapwithspringboot.webapp.model.ContactForm;
import com.bootstrapwithspringboot.webapp.model.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.Date;

@Controller
public class WebAppContoller {
    private String appMode;

    @Autowired
    public WebAppContoller(Environment environment){
        appMode = environment.getProperty("app-mode");

    }


    @RequestMapping("/index")
    public String index(Model model){
        model.addAttribute("datetime", new Date());
        model.addAttribute("username", "@omeryazir");
        model.addAttribute("projectname", "WebApp");

        model.addAttribute("mode", appMode);

        return "index";
    }

    @GetMapping("/calc")
    public String calc(Model model){
        model.addAttribute("calcResult", new CalcResult());
        return "calc";}

    @PostMapping("/calc")
    public String calculator(@ModelAttribute @Valid CalcResult calcResult, BindingResult bindingResult,
                             Model model){
        if (bindingResult.hasErrors()){
            // wywal error do template
            model.addAttribute("error","uu masz błąd!!!");
            return "calc";
        }
        model.addAttribute("result",calcResult.getWeight()/(((calcResult.getHeight())/100)*((calcResult.getHeight())/100)));
        //System.out.println(weight/(((height)/100)*((height)/100)));
        return "calc";
    }


}