package com.example.smartcampusjava.controller;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.smartcampusjava.common.R;
import com.example.smartcampusjava.mapper.NotificationMapper;
import com.example.smartcampusjava.pojo.Notification;
import com.example.smartcampusjava.pojo.TopicCard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/notifications")
public class NotificationController {

    @Autowired
    private NotificationMapper notificationMapper;

    @GetMapping("/page/{start}/{pageSize}/{type}")
    public R<Page<Notification>> searchByPage(@PathVariable Integer start , @PathVariable Integer pageSize,@PathVariable Integer type){

        Page<Notification> Page = new Page<>(start,pageSize);


        LambdaQueryWrapper<Notification> queryWrapper = new LambdaQueryWrapper<>();

        queryWrapper.eq(type!=null,Notification::getType,type);

        notificationMapper.selectPage(Page,queryWrapper);

        return Page!=null?R.success(Page):R.error("系统繁忙！");

    }



}
