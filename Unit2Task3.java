package com.company;

public class Unit2Task3 {
    public static void main (String [] args)
    {
        int number = 1;
        System.out.print( number + "\t");
        int numberNew = 1;

        int sum = 0;
        for ( int i = 1; i <=8; i++ )
        {
            numberNew = numberNew * 2;
            System.out.print( numberNew + "\t" );
            sum = sum + numberNew;
        }
        System.out.println("\n");
        int total = number + sum;
        System.out.println("total summa = " + total );

    }
}
