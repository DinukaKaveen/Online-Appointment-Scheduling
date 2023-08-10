package com.example.backend.controller;

import com.example.backend.model.Appointment;
import com.example.backend.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("http://127.0.0.1:3000")
public class AppointmentController {

    @Autowired
    private AppointmentRepository AppointmentRepo;

    @PostMapping("/MakeAppointment")
    public ResponseEntity<Appointment> newAppointment(@RequestBody Appointment newAppointment){
        AppointmentRepo.save(newAppointment);
        return ResponseEntity.ok(newAppointment);
    }
}
