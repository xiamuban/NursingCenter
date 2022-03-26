package com.nursing.center.controller;

import com.nursing.center.model.User;
import com.nursing.center.service.UserService;
import com.nursing.center.vo.ResultVO;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("/getAll/{id}")
    public List<User> selectAll(@PathVariable Integer id){
        return userService.selectAll(id);
    }

    @RequestMapping("/login")
    public ResultVO login(@RequestBody User user){
        return userService.login(user);
    }
}
