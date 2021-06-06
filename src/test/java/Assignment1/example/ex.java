/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Christopher Polanco
 */
package Assignment1.example;


import java.util.Scanner;

public class ex
{
    public static void main( String[] args )
    {
            System.out.print( "How much do you weigh? (lbs): " );
        Scanner weight = new Scanner(System.in);
        String weigh = weight.nextLine();
        if (!weigh.matches("[0-9]+")) {
            System.out.println("Please enter a number!");
        }
        Scanner alc = new Scanner(System.in);
        System.out.print( "How much alcohol did you consume? (oz): " );

        String alcohol = alc.nextLine();
        if (!alcohol.matches("[0-9]+")) {
            System.out.println("Please enter a number!");
        }

        Scanner hrs = new Scanner(System.in);
        System.out.print( "How many hours ago since you last drank alcohol?: " );

        String hours = hrs.nextLine();
        if (!hours.matches("[0-9]+")) {
            System.out.println("Please enter a number!");
        }

    }
}
