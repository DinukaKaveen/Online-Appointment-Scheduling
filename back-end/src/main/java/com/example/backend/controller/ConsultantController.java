package com.example.backend.controller;

import com.example.backend.exception.UserNotFoundException;
import com.example.backend.model.Consultant;
import com.example.backend.repository.ConsultantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("http://127.0.0.1:3000")
public class ConsultantController {

    @Autowired
    private ConsultantRepository consultantRepo;

    @PostMapping("/RegisterConsultant")
    public ResponseEntity<Consultant> newConsultant(@RequestBody Consultant newConsultant){
        consultantRepo.save(newConsultant);
        return ResponseEntity.ok(newConsultant);
    }

    @GetMapping("/Consultant/{consultantId}")
    public Consultant getConsultantById(@PathVariable Integer consultantId){
        return consultantRepo.findById(consultantId)
                .orElseThrow(() -> new UserNotFoundException(consultantId));
    }
}
