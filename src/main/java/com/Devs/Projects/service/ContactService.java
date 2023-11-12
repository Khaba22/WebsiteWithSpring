package com.Devs.Projects.service;

import com.Devs.Projects.Controller.ContactController;
import com.Devs.Projects.model.Contact;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;
import org.springframework.web.context.annotation.SessionScope;

@Service
//@SessionScope
@ApplicationScope

public class ContactService {


    private int counter =0;

    public ContactService(){
        System.out.println("Contact service been has been initialized");
    }

    private static Logger log = LoggerFactory.getLogger(ContactController.class);

    /**
     * Save Contact Details into DB
     *
     * @param contact
     */
    public void saveMessageDetails(Contact contact){
        boolean isSaved = true;
        //TODO - Need to persist the data into the DB table
        log.info(contact.toString());
    }
    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
}
