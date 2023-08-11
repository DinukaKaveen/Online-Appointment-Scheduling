package com.example.backend.controller;

import com.example.backend.model.Consultant;
import com.example.backend.repository.ConsultantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("http://127.0.0.1:3000")
public class ConsultantController {

    @Autowired
    private ConsultantRepository consultantRepo;

    @GetMapping("/Consultants/{consultantId}")
    public Consultant getConsultantById(@PathVariable Integer consultantId){
        return consultantRepo.findById(consultantId);
    }
}
