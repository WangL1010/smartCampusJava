package com.example.smartcampusjava.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.List;

@Data
public class TopicCard {
    @TableId(type = IdType.AUTO)
    private int id;
    private int type;
    private String userAvatar;
    private String userNickname;
    private String title;
    private String content;
    private List<String> imageList;
    private int likeCount;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserAvatar() {
        return userAvatar;
    }

    public void setUserAvatar(String userAvatar) {
        this.userAvatar = userAvatar;
    }

    public String getUserNickname() {
        return userNickname;
    }

    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<String> getImageList() {
        return imageList;
    }

    public void setImageList(List<String> imageList) {
        this.imageList = imageList;
    }

    public int getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(int likeCount) {
        this.likeCount = likeCount;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "TopicCard{" +
                "id=" + id +
                ", type=" + type +
                ", userAvatar='" + userAvatar + '\'' +
                ", userNickname='" + userNickname + '\'' +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", imageList=" + imageList +
                ", likeCount=" + likeCount +
                '}';
    }
}
