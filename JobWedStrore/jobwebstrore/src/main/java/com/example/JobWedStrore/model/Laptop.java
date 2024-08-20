package com.example.JobWedStrore.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity

public class Laptop {
 @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Long Id;

    private String laptopName;
    
    public Laptop(Long id, String laptopName) {
        Id = id;
        this.laptopName = laptopName;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getLaptopName() {
        return laptopName;
    }

    public void setLaptopName(String laptopName) {
        this.laptopName = laptopName;
    }


}
