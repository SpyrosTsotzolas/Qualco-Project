package com.example.demo.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import com.example.demo.model.Language;

@Mapper
public interface LanguageRepository {

     @Select("SELECT * FROM languages l " +
    "JOIN country_languages cl " +
    "   ON l.language_id = cl.language_id " +
    "JOIN countries c " +
    "   ON c.country_id = cl.country_id " +
    "WHERE c.country_id  = #{country_id}")
    public List < Language > getLanguagesByCountryId(int country_id);
    
}
