package com.javis.UserService.util;

public class StringDemo {
    public String concat(String s1, String s2){
        return s1.concat(s2);
    }
    public String subString(String s, int idx){
        return s.substring(idx);
    }
    public String subString(String s, int start, int end){
        return s.substring(start, end);
    }
    public int compareTo(String s1, String s2){
        return s1.compareTo(s2);
    }
    public int compareToIgnoreCase(String s1, String s2){
        return s1.compareToIgnoreCase(s2);
    }
    public String removeHyphenInIdNum(String id){
        return id.replaceAll("-","");
//        return id.substring(0,6).concat(id.substring(7));
    }

}
