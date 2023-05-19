package com.example.smartcampusjava.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.smartcampusjava.common.R;
import com.example.smartcampusjava.mapper.UserMapper;
import com.example.smartcampusjava.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @GetMapping("/test")
    public R<List<User>> test() {
        List<User> users = userMapper.selectList(null);
        System.out.println(users);
        return R.success(users);
    }

    @PostMapping("/login")
    public R<User> login(@RequestBody User user) {
        System.out.println(user);
        LambdaQueryWrapper<User> qw = new LambdaQueryWrapper<>();
        qw.eq(null != user.getUserphone(), User::getUserphone, user.getUserphone())
                .eq(null != user.getPassword(), User::getPassword, user.getPassword());
        List<User> users = userMapper.selectList(qw);
        if (users.isEmpty()) {
            return R.error("用户帐号或密码错误");
        } else {
            for (int i = 0; i < users.size(); i++) {
                if (user.getUserphone().equals(users.get(i).getUserphone())  && user.getPassword().equals(users.get(i).getPassword())) {
                    return R.success(users.get(i));
                }
            }
        }
        return R.error("用户帐号或密码错误");
    }

}
