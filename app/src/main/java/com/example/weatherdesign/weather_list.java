package com.example.weatherdesign;

import java.util.ArrayList;
import java.util.Date;

public class weather_list{

    String  day;
    int Img;
    String weatherDesc;
    String date;

    public weather_list(String day, int img, String weatherDesc, String date) {
        this.day = day;
        Img = img;
        this.weatherDesc = weatherDesc;
        this.date = date;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public int getImg() {
        return Img;
    }

    public void setImg(int img) {
        Img = img;
    }

    public String getWeatherDesc() {
        return weatherDesc;
    }

    public void setWeatherDesc(String weatherDesc) {
        this.weatherDesc = weatherDesc;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
