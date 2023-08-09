package com.example.backend.controller;

import com.example.backend.model.Seeker;
import com.example.backend.repository.SeekerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("http://127.0.0.1:3000")
public class SeekerController {

    @Autowired
    private SeekerRepository SeekerRepo;

    @PostMapping("/RegisterSeeker")
    public ResponseEntity<Seeker> newSeeker(@RequestBody Seeker newSeeker){
        SeekerRepo.save(newSeeker);
        return ResponseEntity.ok(newSeeker);
    }
}
