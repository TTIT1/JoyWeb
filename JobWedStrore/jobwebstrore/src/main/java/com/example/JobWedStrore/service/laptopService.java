package com.example.JobWedStrore.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.JobWedStrore.model.Laptop;
import com.example.JobWedStrore.repository.laptopRepository;

@Service
public class laptopService {
    @Autowired
    laptopRepository laptopRepository;
   public String hi(){
    laptopRepository.findAll();
    return "j";
   }
}
