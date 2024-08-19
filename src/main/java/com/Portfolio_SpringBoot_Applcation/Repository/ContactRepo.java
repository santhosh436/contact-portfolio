package com.Portfolio_SpringBoot_Applcation.Repository;

import com.Portfolio_SpringBoot_Applcation.Model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepo extends JpaRepository<Contact,Integer> {
}
