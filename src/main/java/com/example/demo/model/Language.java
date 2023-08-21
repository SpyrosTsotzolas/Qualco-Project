package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.HashSet;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
@Table(name = "language")
public class Language {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="language_id",nullable=false,unique=true)
    private int language_id;

    @Column(name = "language", nullable = false)
    private String language;

    @OneToMany(mappedBy = "language_id")
    private HashSet<CountryLanguage> countryLanguages = new HashSet<>();

    

    public Language() {
    }

    public Language(int language_id, String language) {
        this.language_id = language_id;
        this.language = language;
    }

    public int getlanguage_id() {
        return this.language_id;
    }

    public void setlanguage_id(int language_id) {
        this.language_id = language_id;
    }

    public String getLanguage() {
        return this.language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "{" +
            " language_id='" + getlanguage_id() + "'" +
            ", language='" + getLanguage() + "'" +
            "}";
    }

}
