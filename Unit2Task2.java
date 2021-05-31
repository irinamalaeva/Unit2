package com.company;

public class Unit2Task2 {
    public static void main (String[] args){
        int time;
        int quantity = 1;
        System.out.println(" first quantity = " + quantity);
        for ( time = 3; time <= 24; time +=3)
        {
            quantity = quantity * 2;
            System.out.println("quantity in " + time + " hours = " + quantity);
        }
        System.out.println("\n" + "total quantity =  " + quantity );
    }

}
