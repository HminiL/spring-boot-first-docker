package com.javis.UserService.util;

import org.apache.tomcat.jni.Time;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.util.Date;

public class MyUtil {
    public String howLongRemain(LocalDate today, String month, String day){

        Period left = Period.between(today,LocalDate.of(today.getYear(), Integer.parseInt(month), Integer.parseInt(day)));

        return String.format("%s년 %s개월 %s일 남았습니다.",left.getYears(),left.getMonths(), left.getDays());
    }

    public String usedTime(String hour1, String minute1, String second1, String hour2, String minute2, String second2){

        return "남은 이용시간 : " + getTime((int)Duration.between(
                getLocalTime(hour1,minute1,second1), getLocalTime(hour2, minute2, second2)).getSeconds());

    }
    private LocalTime getLocalTime(String hour, String minute, String second){
        return LocalTime.of(Integer.parseInt(hour),Integer.parseInt(minute),Integer.parseInt(second));
    }

    private String getTime(int sec){
        int hour = sec / (60*60);
        int minute = (sec - hour * (60*60))/60;
        int second = sec % 60;
        return String.format("%d 시간 %d 분 %d 초", hour,minute,second);
    }
}
