package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Language;
import com.example.demo.repository.LanguageRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class LanguageController {
    
    @Autowired 
    private LanguageRepository languageRepository;

    @GetMapping("/languages/{country_id}")
    public List<Language> getAllLanguages(@PathVariable(required=false, name="country_id") int country_id) {
        return (List<Language>) languageRepository.getLanguagesByCountryId(country_id);
    }
}
