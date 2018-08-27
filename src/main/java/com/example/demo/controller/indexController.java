package com.example.demo.controller;

import com.example.demo.domain.User;
import com.example.demo.interfaces.UserDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
//@RequestMapping("/demo-api")
@ResponseBody
public class indexController{
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private UserDao mUserDao;
    private Logger logger = LoggerFactory.getLogger(indexController.class);

    @RequestMapping("/index")
    private String index() {

        return "index";
    }

    @PostMapping("/updateUser")
    private void hello(@RequestBody User user) {
        String sql = "select * from user";
        List<Map<String, Object>> list = jdbcTemplate.queryForList(sql);
        logger.error(list.toString());
        mUserDao.insertUser(user);

    }
}
