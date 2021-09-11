/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Carter I. Walker
 */

package org.example;
import java.util.Scanner;
import java.util.Calendar;

public class App 
{
    public static void main( String[] args )
    {
        //Necessary Variable Declaration
        Scanner input = new Scanner(System.in);
        int age, retirementAge, currentYear, retirementYear;

        //Querying
        System.out.println( "What is your current age? " );
        age = input.nextInt();

        System.out.println( "At what age would you like to retire? ");
        retirementAge = input.nextInt();

        //Calculation
        currentYear = Calendar.getInstance().get(Calendar.YEAR);
        retirementYear = (retirementAge - age) + currentYear;

        //Final output
        System.out.println("You have " +  (retirementAge - age) + " years left until you can retire.");
        System.out.println("It's " + currentYear + ", so you can retire in " + retirementYear + ".");

    }
}
