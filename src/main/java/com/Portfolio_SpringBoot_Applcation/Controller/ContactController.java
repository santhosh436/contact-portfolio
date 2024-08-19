package com.Portfolio_SpringBoot_Applcation.Controller;

import com.Portfolio_SpringBoot_Applcation.Model.Contact;
import com.Portfolio_SpringBoot_Applcation.Service.ContactService;
import jakarta.persistence.GeneratedValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/")
@CrossOrigin
public class ContactController {

    @Autowired
    private ContactService contactService;

    @PostMapping(value = "/send")
    public Contact createContact(@RequestBody Contact contact){
        return contactService.saveContactDetails(contact);
    }

    @GetMapping(value = "/get")
    public List<Contact> getDetails(){
        return contactService.getAllDetails();
    }



}
