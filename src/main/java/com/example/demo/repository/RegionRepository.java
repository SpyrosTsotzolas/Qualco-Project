package com.example.demo.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.demo.model.Region;

@Mapper
public interface RegionRepository {
    
    @Select("SELECT * FROM regions")
    public List < Region > findAll();
}
