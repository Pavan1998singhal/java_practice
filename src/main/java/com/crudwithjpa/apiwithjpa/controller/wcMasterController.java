package com.crudwithjpa.apiwithjpa.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import com.crudwithjpa.apiwithjpa.model.wcMaster;
import com.crudwithjpa.apiwithjpa.repository.wcMasterRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class wcMasterController {

    @Autowired
    private wcMasterRepository wcMasterRepository;

    @GetMapping("/home")
    public String home() {
        return "Hello World";
    }

    // get all the wcMasters.
    @GetMapping("/wcMasters")
    public List<wcMaster> getUsers() {
        return this.wcMasterRepository.findAll();
    }

    // get wcMaster by id
    @GetMapping("/wcMasters/{id}")
    public Optional<wcMaster> getWCMaster(@PathVariable(value = "id") Integer wcID) {
        return this.wcMasterRepository.findById(wcID);
    }

    // add new wcMaster
    @PostMapping("/wcMasters")
    public wcMaster addWCMaster(@RequestBody wcMaster wcMaster) {
        return this.wcMasterRepository.save(wcMaster);
    }

    // update wcMaster by id
    @PutMapping("/wcMasters/{id}")
    public wcMaster updateWCMaster(@PathVariable(value = "id") Integer wcID, @RequestBody wcMaster wcMasterDetails) {
        wcMaster wcMaster = this.wcMasterRepository.findById(wcID).get();

        wcMaster.setName(wcMasterDetails.getName());
        wcMaster.setArea(wcMasterDetails.getArea());

        System.out.println("Hello World");
        wcMaster updatedWCMaster = this.wcMasterRepository.save(wcMaster);
        return updatedWCMaster;
    }

    @DeleteMapping("/wcMasters/{id")
    public Map<String, wcMaster> deleteWCMaster(@PathVariable(value = "id") Integer wcID) {
        wcMaster wcMaster = this.wcMasterRepository.findById(wcID).get();

        System.out.println("Hello");
        this.wcMasterRepository.delete(wcMaster);
        System.out.println("World");
        Map<String, wcMaster> response = new HashMap<>();
        response.put("Delete Successfully !!", wcMaster);
        return response;
    }
}
