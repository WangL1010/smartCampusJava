package com.example.smartcampusjava.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.smartcampusjava.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}