package com.example.demo.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.demo.model.CountryStatistics;


@Mapper
public interface CountryStatisticsRepository {

    @Select("SELECT c.name AS continent_name, " +
            "r.name AS region_name, " +
            "co.name AS country_name, " +
            "cs.year, " +
            "cs.population, " +
            "cs.gdp " +
            "FROM continents c " +
            "JOIN regions r ON c.continent_id = r.continent_id " +
            "JOIN countries co ON r.region_id = co.region_id " +
            "JOIN country_stats cs ON co.country_id = cs.country_id")
    public List < CountryStatistics > getCountryStatistics();
    
}
