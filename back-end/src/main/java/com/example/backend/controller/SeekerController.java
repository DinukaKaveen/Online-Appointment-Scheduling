package com.example.backend.controller;

import com.example.backend.model.Seeker;
import com.example.backend.repository.SeekerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SeekerController {

    @Autowired
    private SeekerRepository SeekerRepo;

    @PostMapping("/RegisterSeeker")
    Seeker newSeeker(@RequestBody Seeker newSeeker){
        return SeekerRepo.save(newSeeker);
    }
}
