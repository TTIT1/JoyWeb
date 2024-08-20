package com.example.JobWedStrore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


import com.example.JobWedStrore.service.laptopService;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
@RequestMapping("/laptop")
public class laptopCon {
    @Autowired
    laptopService laptopService;
    @GetMapping("/hihi")
   
   public String name(){
    laptopService.hi();
    return "test";
   }
    
}
