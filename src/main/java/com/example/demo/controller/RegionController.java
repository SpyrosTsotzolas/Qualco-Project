package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Region;
import com.example.demo.repository.RegionRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class RegionController {

    @Autowired
    private RegionRepository regionRepository;

    @GetMapping("/regions")
    public List<Region> getAllRegions() {
        return (List<Region>) regionRepository.findAll();
    }

    
}
