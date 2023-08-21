package com.example.demo.model;

import java.util.HashSet;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "country")
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="country_id",nullable=false,unique=true)
    private int country_id;

    @Column(name = "name")
    private String name;

    @Column(name = "area", nullable = false)
    private double area;

    @Column(name = "national_day")
    private String national_day;

    @Column(name = "country_code2", nullable = false)
    private String country_code2;

    @Column(name = "country_code3", nullable = false)
    private String country_code3;

    @ManyToOne
    @JoinColumn(name = "region_id", nullable = false)
    private Region region_id;

    @OneToMany(mappedBy = "country_id")
    private HashSet<CountryLanguage> countryLanguages = new HashSet<>();

    @OneToMany(mappedBy = "country_id")
    private HashSet<CountryStat> countryStats = new HashSet<>();

    public Country() {

    }

    public Country(int country_id, String name, double area, String national_day, String country_code2, String country_code3,
            Region region_id) {
        this.country_id = country_id;
        this.name = name;
        this.area = area;
        this.national_day = national_day;
        this.country_code2 = country_code2;
        this.country_code3 = country_code3;
        this.region_id = region_id;
    }


    public int getCountry_id() {
        return this.country_id;
    }

    public void setCountry_id(int country_id) {
        this.country_id = country_id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getArea() {
        return this.area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getNational_day() {
        return this.national_day;
    }

    public void setNational_day(String national_day) {
        this.national_day = national_day;
    }

    public String getCountry_code2() {
        return this.country_code2;
    }

    public void setCountry_code2(String country_code2) {
        this.country_code2 = country_code2;
    }

    public String getCountry_code3() {
        return this.country_code3;
    }

    public void setCountry_code3(String country_code3) {
        this.country_code3 = country_code3;
    }

    public Region getRegion_id() {
        return this.region_id;
    }

    public void setRegion_id(Region region_id) {
        this.region_id = region_id;
    }

    @Override
    public String toString() {
        return "{" +
            " country_id='" + getCountry_id() + "'" +
            ", name='" + getName() + "'" +
            ", area='" + getArea() + "'" +
            ", national_day='" + getNational_day() + "'" +
            ", country_code2='" + getCountry_code2() + "'" +
            ", country_code3='" + getCountry_code3() + "'" +
            ", region_id='" + getRegion_id() + "'" +
            "}";
    }

}