package com.javis.UserService.util;

public class MyCalculation {

    public int sum(int num1, int num2){
        return num1+num2;
    }
    public int subtract(int num1, int num2){
        return num1-num2;
    }

    public String multiple(String num1, String num2){
        return String.format("%d",Integer.parseInt(num1) * Integer.parseInt(num2));
    }
    public String divide(String num1, String num2){
        return String.format("%d",Integer.parseInt(num1) / Integer.parseInt(num2));
    }

}