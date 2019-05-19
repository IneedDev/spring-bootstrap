package com.bootstrapwithspringboot.webapp.model;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ContactService {
    private static List<ContactForm> contactFormList = new ArrayList<>();
    //bean
    //singelton

    public ContactForm addPhoneContact (ContactForm contactForm){
        contactFormList.add(contactForm);
//        System.out.println("ContactForm: " +
//                contactForm.getSurname()+" | "+
//                contactForm.getName()+" | "+
//                contactForm.getPhonenumber() + "  "+
//                contactFormList.size());
        return contactForm;
    }

    public List<ContactForm> printAllPhoneContacts(){
        return contactFormList;
    }
    
}
