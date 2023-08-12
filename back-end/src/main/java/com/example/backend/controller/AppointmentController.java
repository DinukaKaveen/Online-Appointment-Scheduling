package com.example.backend.controller;

import com.example.backend.exception.UserNotFoundException;
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

    @GetMapping("/SeekerAppointments/{seekerId}")
    public List<Appointment> getAppointmentbySeekerId(@PathVariable Integer seekerId){
        return AppointmentRepo.findAllBySeekerId(seekerId);
    }

    @GetMapping("/ConsultantAppointments/{consultantId}")
    public List<Appointment> getAppointmentbyconsultantId(@PathVariable Integer consultantId){
        return AppointmentRepo.findAllByConsultantId(consultantId);
    }

    @PutMapping("/ConsultantAccept/{appointmentId}")
    Appointment updateStatus(@RequestBody Appointment update, @PathVariable Integer appointmentId){
        return AppointmentRepo.findById(appointmentId)
                .map(appointment -> {
                    appointment.setStatus("Accept");

                    return AppointmentRepo.save(appointment);
                }).orElseThrow(()-> new UserNotFoundException(appointmentId));
    }
}
