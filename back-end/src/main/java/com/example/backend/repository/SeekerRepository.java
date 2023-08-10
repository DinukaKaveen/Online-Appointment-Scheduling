package com.example.backend.repository;

import com.example.backend.model.Seeker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeekerRepository extends JpaRepository <Seeker,Integer> {

    Seeker findByUsername(String username);
}
