package com.example.backend.controller;

import com.example.backend.model.Availability;
import com.example.backend.repository.AvailabilityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/Availability")
    List<Availability> getAllAvailability(){
        return availabilityRepo.findAll();
    }
}
