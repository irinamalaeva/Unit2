package com.company;

public class Unit2Task5 {
    public static void main (String[] args)
    {
        double inch = 2.54;
        int number;
        double wayCentimeter;
        for ( number = 1; number <= 20; number ++)
        {
            wayCentimeter = inch * number;
            System.out.println( number + " inch = " + wayCentimeter + " centimeters");
        }

    }
}
