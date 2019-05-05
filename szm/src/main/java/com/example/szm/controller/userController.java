package com.example.szm.controller;

import com.example.szm.entity.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Controller
@RequestMapping("/jdbc")
public class userController {
    @Resource

    private JdbcTemplate jdbcTemplate;  //JdbcTemplate 提供了来封装数据库jdbc操作细节：



    @RequestMapping("/userlist")

    public String getUserList(ModelMap map){

        String sql = "SELECT * FROM student";

        List<User> userList = jdbcTemplate.query(sql, new RowMapper<User>() {

            User user = null;

            @Override

            public User mapRow(ResultSet rs, int rowNum) throws SQLException {

                user = new User();

                user.setId(rs.getInt("id"));

                user.setName(rs.getString("name"));

                return user;

            }});

        for(User user:userList){

            System.out.println(user.getName()+user.getId());

        }

        map.addAttribute("users", userList);

        return "user";

    }
    @GetMapping("/userlists")
    public ModelAndView userList(Model model){
        return  new ModelAndView("demo");
    }
}
