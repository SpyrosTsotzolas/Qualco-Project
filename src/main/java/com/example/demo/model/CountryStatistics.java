package com.example.demo.model;

public class CountryStatistics {

    private String continent_name;
    private String region_name;
    private String country_name;
    private int year;
    private int population;
    private long gdp;


    public CountryStatistics() {
    }

    public CountryStatistics(String continent_name, String region_name, String country_name, int year, int population, long gdp) {
        this.continent_name = continent_name;
        this.region_name = region_name;
        this.country_name = country_name;
        this.year = year;
        this.population = population;
        this.gdp = gdp;
    }

    public String getContinentName() {
        return this.continent_name;
    }

    public void setContinentName(String continent_name) {
        this.continent_name = continent_name;
    }

    public String getRegionName() {
        return this.region_name;
    }

    public void setRegionName(String region_name) {
        this.region_name = region_name;
    }

    public String getCountryName() {
        return this.country_name;
    }

    public void setCountryName(String country_name) {
        this.country_name = country_name;
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

    @Override
    public String toString() {
        return "{" +
            " continent_name='" + getContinentName() + "'" +
            ", region_name='" + getRegionName() + "'" +
            ", country_name='" + getCountryName() + "'" +
            ", year='" + getYear() + "'" +
            ", population='" + getPopulation() + "'" +
            ", gdp='" + getGdp() + "'" +
            "}";
    }
    
    
}
