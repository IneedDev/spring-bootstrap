package com.bootstrapwithspringboot.webapp.model;

import lombok.Data;

@Data
public class ContactForm {
    private String name;
    private String surname;
    private int phonenumber;
}
