package com.company;

public class Unit2Task0 {
    public static void main (String [] args){
        int number1;// cycle for
        for ( number1 = 0; number1 <= 10; number1++){
            System.out.print( number1 + " ");
        }
        System.out.println("\n");

        int digit = 0; // cycle while
        while ( digit <= 10 )
        {

            System.out.print( digit + " ");
            digit = digit + 1;
        }
        System.out.println("\n");

        int number2 = 0;// cycle do while
        do
        {
          System.out.print(number2 + " ");
          number2 = number2 + 1;
        }
        while ( number2 <=10);
    }
}
