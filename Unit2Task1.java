package com.company;

public class Unit2Task1 {
    public static void main (String[] args)
    {
        double way = 10;
        int days;
        double sum = 10;
        for ( days = 1; days <7; days ++){
          System.out.println("each day =" + way);
           way = way * 1.1;
           sum = sum + way;
        }
        System.out.println("total distance = " + sum);
    }
}
