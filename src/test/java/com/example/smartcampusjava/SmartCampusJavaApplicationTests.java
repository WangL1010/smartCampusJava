package com.example.smartcampusjava;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.smartcampusjava.mapper.UserMapper;
import com.example.smartcampusjava.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SmartCampusJavaApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    void contextLoads() {
//        List<User> users = userMapper.selectList(null);
//        System.out.println(users);
//        IPage page = new Page(1, 2);
//        userMapper.selectPage(page, null);
//
////        //条件查询
//        User user = new User();
//        user.setSchoolId(10536L);
//        QueryWrapper<User> qw = new QueryWrapper<>();
//        qw.lambda().lt(null != user.getStudentId(), User::getSchoolId, 1L);
//        List<User> users = userMapper.selectList(qw);
//        System.out.println(users);
//        LambdaQueryWrapper<User> qw = new LambdaQueryWrapper<>();
//        qw.eq(User::getStudentId,10536L);
//        List<User> users1 = userMapper.selectList(qw);
//        System.out.println(users1);
//        User user = userMapper.selectById(2L);
//        System.out.println(user);

        User user=new User();
        user.setId(4L);
        user.setName("wangl");
        user.setPassword("2123456");
        user.setUserphone("12345678900");
        user.setSchoolId(10536L);
        user.setStudentId("1205632");
        user.setSchoolName("长理");
        int insert = userMapper.insert(user);
    }


}
