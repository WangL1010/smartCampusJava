package com.example.smartcampusjava.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class User {
    @TableId(type = IdType.AUTO)
    private Long id;
    private String name;
    private String userphone;
    private String password;
    private Long schoolId;
    private String schoolName;
    private String studentId;
}
