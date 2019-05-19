package com.bootstrapwithspringboot.webapp.contoller;

import com.bootstrapwithspringboot.webapp.model.ContactForm;
import com.bootstrapwithspringboot.webapp.model.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PhoneController {

    @Autowired
    ContactService contactService;

    @GetMapping("/addcontactform")
    public String addform(Model model){
        model.addAttribute("contactForm",new ContactForm());
        return "addcontactform";
    }

    @GetMapping("/contactlist")
    public String printContacts (Model model){
        model.addAttribute("contact_list",contactService.printAllPhoneContacts());
        return "contactlist";
    }
    //to avoid creating additional template use ModelAndView

//    @GetMapping("/contactlist")
//    public ModelAndView printContactsModelAndView (Model model){
//        ModelAndView modelAndView = new ModelAndView("addcontactform");
//        model.addAttribute("contact_list",contactService.printAllPhoneContacts());
//        return modelAndView;
//    }

    @PostMapping("/addcontactform")
    public String contactDetails(@ModelAttribute ContactForm contactForm, Model model){
        model.addAttribute("addContact",contactService.addPhoneContact(contactForm));
        return "addcontactform";
    }

//    @GetMapping("/contactlist")
//    public String printContacts (Model model){
//        model.addAttribute("contact_list",contactService.printAllPhoneContacts());
//        return "contactlist";
//    }
//
//    @PostMapping("/addcontactform")
//    public String contactDetails(@ModelAttribute ContactForm contactForm, Model model){
//        model.addAttribute("addContact",contactService.addPhoneContact(contactForm));
//        return "addcontactform";
//    }

}
