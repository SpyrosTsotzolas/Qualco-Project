package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "country_stats")
public class CountryStat {

    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country_id;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="year",nullable=false,unique=true)
    private int year;

    @Column(name = "population")
    private int population;

    @Column(name = "gdp")
    private long gdp;

    private String name;
    private String country_code3;


    public CountryStat() {
    }

    public CountryStat(Country country_id, int year, int population, long gdp, String name, String country_code3) {
        this.country_id = country_id;
        this.year = year;
        this.population = population;
        this.gdp = gdp;
        this.name = name;
        this.country_code3 = country_code3;
    }

    public Country getCountry_id() {
        return this.country_id;
    }

    public void setCountry_id(Country country_id) {
        this.country_id = country_id;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPopulation() {
        return this.population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public long getGdp() {
        return this.gdp;
    }

    public void setGdp(long gdp) {
        this.gdp = gdp;
    }

    public String getName() {
        return this.name;
    }

    public void seName(String name) {
        this.name = name;
    }

    public String getCountryC() {
        return this.name;
    }

    public String getCountry_code3() {
        return this.country_code3;
    }

    public void setCountry_code3(String country_code3) {
        this.country_code3 = country_code3;
    }


    @Override
    public String toString() {
        return "{" +
            " country_id='" + getCountry_id() + "'" +
            ", year='" + getYear() + "'" +
            ", population='" + getPopulation() + "'" +
            ", gdp='" + getGdp() + "'" +
            ", name='" + getName() + "'" +
            ", country_code3='" + getCountry_code3() + "'" +
            "}";
    }

    
}
