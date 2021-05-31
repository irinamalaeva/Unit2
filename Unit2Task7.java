package com.company;

public class Unit2Task7 {
    public static void main (String []args){
        int oddNumber;
        int summaOdd = 0;
        int counter = 0;
        for ( oddNumber = 1; oddNumber < 99; oddNumber +=2, counter ++  )// number 99 is not included
        {
            if ( counter ==10 ||counter == 20 || counter == 30 || counter ==40)
            {
                System.out.println("\n");
            }
            System.out.print ( oddNumber + "\t");
            summaOdd = oddNumber + summaOdd;
        }
        System.out.println( "\n" + "\n" + "total summa odd numbers = " + summaOdd );



    }
}
