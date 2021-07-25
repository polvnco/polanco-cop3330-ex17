/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Christopher Polanco
 */
package Assignment1.example;


import java.util.Scanner;

public class ex17
{
    public static void main( String[] args )
    {
        Scanner weight = new Scanner(System.in);
        System.out.print( "How much do you weigh? (lbs): " );
        while (!weight.hasNextInt()) {
            System.out.print("Please enter a number!\nHow much do you weigh? (lbs): ");
            weight.next();
        }

        Scanner alc = new Scanner(System.in);
        System.out.print( "How much alcohol did you consume? (oz): " );
        while (!alc.hasNextInt()) {
            System.out.print("Please enter a number!\nHow much alcohol did you consume? (oz): ");
            alc.next();
        }

        Scanner hrs = new Scanner(System.in);
        System.out.print( "How many hours ago since you last drank alcohol?: " );
        while (!hrs.hasNextInt()) {
            System.out.print("Please enter a number!\nHow many hours ago since you last drank alcohol?: ");
            hrs.next();
        }

        String gender;
        double r = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("What is your gender, male of female?");
        gender = scan.nextLine();
            if (gender.equals("f") || gender.equals("F") || gender.equals("female") || gender.equals("Female") || gender.equals("FEMALE")) {
                r = 0.66;
            } else if (gender.equals("m") || gender.equals("M") || gender.equals("male") || gender.equals("Male") || gender.equals("MALE")) {
                r = 0.73;
            }


        String weigh = weight.nextLine();
        String alcohol = alc.nextLine();
        String hours = hrs.nextLine();

        double A = Integer.parseInt(alcohol);
        double W = Integer.parseInt(weigh);
        double H = Integer.parseInt(hours);

        double calc1 = A * 5.14;
        double calc2 = W * r;
        double calc3 = 0.015 * H;
        double calc1_2 = calc1 / calc2;
        double BAC = calc1_2 - calc3;
        System.out.print("Your BAC is ");
        System.out.printf("%.2f\n", BAC);
        if (BAC > 0.08){
            System.out.print("It is not legal for you to drive.");
        }
    }
}