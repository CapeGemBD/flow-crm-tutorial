package com.example.application.api;

import com.example.application.data.Contact;
import com.example.application.data.ContactRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/contacts")
public class ContactController {

  @Autowired
  private ContactRepository contactRepository;

  @GetMapping
  public List<Contact> getAll() {
    return this.contactRepository.findAll();
  }


}
