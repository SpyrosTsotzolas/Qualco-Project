package com.example.demo.repository;

import java.util.List;

// import org.apache.ibatis.annotations.Delete;
// import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
//import org.apache.ibatis.annotations.Update;

import com.example.demo.model.Country;

@Mapper
public interface CountryMyBatisRepository {
    @Select("select * from countries")
    public List < Country > findAll();

    @Select("SELECT * FROM countries WHERE id = #{id}")
    public Country findById(long id);

    // @Delete("DELETE FROM countries WHERE id = #{id}")
    // public int deleteById(long id);

    // @Insert("INSERT INTO countries(id, first_name, last_name,email_address) " +
    //     " VALUES (#{id}, #{firstName}, #{lastName}, #{emailId})")
    // public int insert(Country employee);

    // @Update("Update countries set first_name=#{firstName}, " +
    //     " last_name=#{lastName}, email_address=#{emailId} where id=#{id}")
    // public int update(Country employee);
}
