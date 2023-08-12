package com.example.backend.controller;

import com.example.backend.model.Appointment;
import com.example.backend.repository.AppointmentRepository;
import com.example.backend.repository.SeekerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://127.0.0.1:3000")
public class AppointmentController {

    @Autowired
    private AppointmentRepository AppointmentRepo;
    private SeekerRepository SeekerRepo;

    @PostMapping("/MakeAppointment")
    public ResponseEntity<Appointment> newAppointment(@RequestBody Appointment newAppointment){
        AppointmentRepo.save(newAppointment);
        return ResponseEntity.ok(newAppointment);
    }

    @GetMapping("/Appointments/{seekerId}")
    public List<Appointment> getAppointmentbySeekerId(@PathVariable Integer seekerId){
        return AppointmentRepo.findAllBySeekerId(seekerId);
    }

    @GetMapping("/Appointments/{consultantId}")
    public List<Appointment> getAppointmentbyconsultantId(@PathVariable Integer consultantId){
        return AppointmentRepo.findAllByconsultantId(consultantId);
    }
}
