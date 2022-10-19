package com.example.work6.entity;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Date;

@EntityScan
public class Picture {
    private long id;
    private String value;
    private String place;
    private Date addtime;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    @Override
    public String toString() {
        return "picture{" +
                "id=" + id +
                ", value='" + value + '\'' +
                ", place='" + place + '\'' +
                ", addtime=" + addtime +
                '}';
    }
}
