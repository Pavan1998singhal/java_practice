package com.crudwithjpa.apiwithjpa.controller;

import java.util.List;

import com.crudwithjpa.apiwithjpa.model.wcMaster;
import com.crudwithjpa.apiwithjpa.repository.wcMasterRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class wcMasterController {

    @Autowired
    private wcMasterRepository wcMasterRepository;

    @GetMapping("/home")
    public String home() {
        return "Hello World";
    }

    // get all the Users.
    @GetMapping("/wcMasters")
    public List<wcMaster> getUsers() {
        try {
            return this.wcMasterRepository.findAll();
        } catch (Exception ex) {
            System.out.println("Hello");
        }
        return null;
    }
}
