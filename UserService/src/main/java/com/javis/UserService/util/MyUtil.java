package com.javis.UserService.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyUtil {
    public String now(){
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        String s = simpleDateFormat.format(date);
        return s;
    }

}
