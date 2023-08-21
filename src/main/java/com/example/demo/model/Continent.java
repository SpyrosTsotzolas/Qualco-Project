package com.example.demo.model;

import java.util.HashSet;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "continent")
public class Continent {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="continent_id",nullable=false,unique=true)
    private int continent_id;

    @Column(name = "name", nullable = false)
    private String name;

    @OneToMany(mappedBy = "continent_id")
    private HashSet<Region> regions = new HashSet<>();


    public Continent() {
    }

    public Continent(int continent_id, String name) {
        this.continent_id = continent_id;
        this.name = name;
    }

    public int getContinentId() {
        return this.continent_id;
    }

    public void setContinentId(int continent_id) {
        this.continent_id = continent_id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }   


    @Override
    public String toString() {
        return "{" +
            " continent_id='" + getContinentId() + "'" +
            ", name='" + getName() + "'" +
            "}";
    }

    
}
