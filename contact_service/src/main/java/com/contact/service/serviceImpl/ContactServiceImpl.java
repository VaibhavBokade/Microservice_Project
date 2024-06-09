package com.contact.service.serviceImpl;

import com.contact.entity.Contact;
import com.contact.service.ContactService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService {

    List<Contact> list = new ArrayList<>();

    public ContactServiceImpl() {
        list.add(new Contact(1L, "vaibhav@gmail.com", "Vaibhav", 1231L));
        list.add(new Contact(2L, "chetan@gmail.com", "Chetan", 1232L));
        list.add(new Contact(3L, "akshay@gmail.com", "Akshay", 1233L));
        list.add(new Contact(4L, "ankush@gmail.com", "Ankush", 1234L));
    }

    @Override
    public List<Contact> getContactsOfUser(Long userId) {
        return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
    }
}
