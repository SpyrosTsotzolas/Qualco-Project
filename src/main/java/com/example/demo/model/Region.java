package com.example.demo.model;

import java.util.HashSet;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "region")
public class Region {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="region_id",nullable=false,unique=true)
    private int region_id;

    @Column(name = "name", nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "continent_id", nullable = false)
    private Continent continent_id;

    @OneToMany(mappedBy = "region_id")
    private HashSet<Country> countries = new HashSet<>();


    public Region() {
    }

    public Region(int region_id, String name, Continent continent_id) {
        this.region_id = region_id;
        this.name = name;
        this.continent_id = continent_id;
    }


    public int getRegionId() {
        return this.region_id;
    }

    public void setRegionId(int region_id) {
        this.region_id = region_id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Continent getContinentId() {
        return this.continent_id;
    }

    public void setContinentId(Continent continent_id) {
        this.continent_id = continent_id;
    }


    @Override
    public String toString() {
        return "{" +
            " region_id='" + getRegionId() + "'" +
            ", name='" + getName() + "'" +
            ", continent_id='" + getContinentId() + "'" +
            "}";
    }


    
}
