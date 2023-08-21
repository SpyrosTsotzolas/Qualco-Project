package com.example.demo.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.demo.model.Country;

@Mapper
public interface CountryRepository {

    @Select("SELECT * FROM countries")
    public List < Country > findAll();

}