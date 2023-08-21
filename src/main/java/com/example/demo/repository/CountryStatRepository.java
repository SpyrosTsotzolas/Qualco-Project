package com.example.demo.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.demo.model.CountryStat;


@Mapper
public interface CountryStatRepository {
    
    @Select("SELECT c.name, c.country_code3, cs.year, cs.population, cs.gdp " +
            "FROM countries c " +
            "JOIN ( " +
            "  SELECT " +
            "    country_id, " +
            "    MAX(gdp / population) AS max_ratio " +
            "  FROM country_stats " +
            "  GROUP BY country_id " +
            ") AS max_ratios " +
            "ON c.country_id = max_ratios.country_id " +
            "JOIN country_stats cs " +
            "ON c.country_id = cs.country_id AND (cs.gdp / cs.population) = max_ratios.max_ratio")
    public List < CountryStat > getCountryStatsWithMaxRatio();
}
