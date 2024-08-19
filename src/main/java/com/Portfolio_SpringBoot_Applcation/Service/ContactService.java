package com.Portfolio_SpringBoot_Applcation.Service;

import com.Portfolio_SpringBoot_Applcation.Model.Contact;
import com.Portfolio_SpringBoot_Applcation.Repository.ContactRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactService {

    @Autowired
    private ContactRepo contactRepo;

    public Contact saveContactDetails(Contact contact){

        return contactRepo.save(contact);
    }

    public List<Contact> getAllDetails(){
        return contactRepo.findAll();
    }



}
