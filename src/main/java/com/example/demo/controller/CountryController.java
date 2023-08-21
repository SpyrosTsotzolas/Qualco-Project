package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Country;
import com.example.demo.repository.CountryRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CountryController {
    
    @Autowired 
    private CountryRepository countryRepository;

    @GetMapping("/countries")
    public List<Country> getAllCountries() {
        return (List<Country>) countryRepository.findAll();
    }

    
}