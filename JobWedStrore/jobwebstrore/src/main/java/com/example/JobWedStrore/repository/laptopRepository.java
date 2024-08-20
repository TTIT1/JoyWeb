package com.example.JobWedStrore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.JobWedStrore.model.Laptop;

@Repository
public interface laptopRepository extends JpaRepository<Laptop,Long> {

    
} 
