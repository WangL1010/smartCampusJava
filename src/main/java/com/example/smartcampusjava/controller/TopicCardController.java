package com.example.smartcampusjava.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.smartcampusjava.common.R;
import com.example.smartcampusjava.mapper.TopicCardMapper;
import com.example.smartcampusjava.pojo.TopicCard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/topicCards")
public class TopicCardController {

    @Autowired
    private TopicCardMapper topicCardMapper;

    @GetMapping("/page/{start}/{pageSize}/{type}")
    public R<Page<TopicCard>> searchByPage(@PathVariable Integer start ,@PathVariable Integer pageSize,@PathVariable Integer type){

        Page<TopicCard> topicCardPage = new Page<>(start,pageSize);

        LambdaQueryWrapper<TopicCard> queryWrapper = new LambdaQueryWrapper<>();

        queryWrapper.eq(TopicCard::getType,type);


        Page<TopicCard> topicCardPage1 = topicCardMapper.selectPage(topicCardPage, queryWrapper);


        return topicCardPage!=null?R.success(topicCardPage1):R.error("系统繁忙！");

    }



}
