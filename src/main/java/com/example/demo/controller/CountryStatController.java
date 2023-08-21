package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.CountryStat;
import com.example.demo.repository.CountryStatRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CountryStatController {
    
    @Autowired 
    private CountryStatRepository countryStatRepository;

    @GetMapping("/countries-stats")
    public List<CountryStat> getCountryStatsWithMaxRatio() {
        return (List<CountryStat>) countryStatRepository.getCountryStatsWithMaxRatio();
    }

}
