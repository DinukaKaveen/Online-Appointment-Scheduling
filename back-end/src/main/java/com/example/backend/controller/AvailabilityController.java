package com.example.backend.controller;

import com.example.backend.model.Availability;
import com.example.backend.repository.AvailabilityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("http://127.0.0.1:3000")
public class AvailabilityController {

    @Autowired
    private AvailabilityRepository availabilityRepo;

    @PostMapping("/NewAvailability")
    public ResponseEntity<Availability> newAvailability(@RequestBody Availability newAvailability){
        availabilityRepo.save(newAvailability);
        return ResponseEntity.ok(newAvailability);
    }
}
