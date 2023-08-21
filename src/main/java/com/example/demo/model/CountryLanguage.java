package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "country_language")
public class CountryLanguage {
   
    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country_id;
    
    @ManyToOne
    @JoinColumn(name = "language_id")
    @Id
    private Language language_id;

    @Column(name = "official", nullable = false)
    private boolean official;


    public CountryLanguage() {
    }

    public CountryLanguage(Country country_id, Language language_id, boolean official) {
        this.country_id = country_id;
        this.language_id = language_id;
        this.official = official;
    }

   
    public Country getcountry_id() {
        return this.country_id;
    }

    public void setcountry_id(Country country_id) {
        this.country_id = country_id;
    }

   
    public Language getlanguage_id() {
        return this.language_id;
    }

    public void setlanguage_id(Language language_id) {
        this.language_id = language_id;
    }

    public boolean getOfficial() {
        return this.official;
    }

    public void setOfficial(boolean official) {
        this.official = official;
    }

    @Override
    public String toString() {
        return "{" +
            " country_id='" + getcountry_id() + "'" +
            ", language_id='" + getlanguage_id() + "'" +
            ", official='" + getOfficial() + "'" +
            "}";
    }
    
}
