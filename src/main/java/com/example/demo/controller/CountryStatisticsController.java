package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.CountryStatistics;
import com.example.demo.repository.CountryStatisticsRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CountryStatisticsController {

    @Autowired 
    private CountryStatisticsRepository countryStatisticsRepository;

    @GetMapping("/countries-statistics")
    public List<CountryStatistics> getCountryStatistics() {
        return (List<CountryStatistics>) countryStatisticsRepository.getCountryStatistics();
    }
    
}
