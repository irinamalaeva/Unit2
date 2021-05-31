package com.company;

public class Unit2Task4 {
    public static void main (String [] args)
    {
        // I shall try to multiply 7 * 9 = 63
        int number1 = 7;
        int number2;
        int  summa = 0;

        for ( number2 = 1; number2 <= 9; number2 ++)
        {
            summa = summa + number1;
            System.out.print(summa + "\t");
        }
        System.out.println( "\n" + "\n" + "Total 7*9 = " + summa );
    }

}
