package com.example.smartcampusjava.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class Notification {
    private int id;
    private boolean isRead;
    private Integer type;
    private String title;
    private String unit;
    private String content;
    private Date time;



    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isRead() {
        return isRead;
    }

    public void setRead(boolean isRead) {
        this.isRead = isRead;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Notification{" +
                "id=" + id +
                ", isRead=" + isRead +
                ", title='" + title + '\'' +
                ", unit='" + unit + '\'' +
                ", content='" + content + '\'' +
                ", time=" + time +
                '}';
    }
}
