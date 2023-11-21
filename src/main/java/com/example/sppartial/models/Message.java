package com.example.sppartial.models;

import java.util.Date;

public class Message {

    private Date date;
    private String message;
    private String house;

    public Message(){}

    public Message(Date date, String message, String house){
        this.date = date;
        this.message = message;
        this.house = house;
    }

    public Date getDate(){
        return this.date;
    }

    public String getMessage(){
        return this.message;
    }

    public String getHouse(){
        return this.house;
    }




}
