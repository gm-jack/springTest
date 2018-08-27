package com.example.demo.interfaces;

import com.example.demo.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserDao {

    @Insert("INSERT INTO user (name,age) VALUES (#{name},#{age}) ")
    int insertUser(User user);
}
