package com.company;

public class Unit2Task6 {
    public static void main (String [] args)
    {
        int number, quantity;
        int counter = 0;
        for ( number =2; number <= 100; number +=2, counter ++ )
        {
            if ( counter == 10 || counter == 20 || counter == 30 || counter ==40)
            {
                System.out.println( "\n");
            }

          System.out.print( number + "\t");
        }
    }
}
