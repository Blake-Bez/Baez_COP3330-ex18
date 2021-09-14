/*
 *  UCF COP3330 Fall 2021 Assignment 18 Solution
 *  Copyright 2021 Blake Baez
 */
package org.example;
import java.util.Scanner;

public class App 
{
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Press C to convert from Fahrenheit to Celsius.\nPress F to convert from Celsius to Fahrenheit. \nYour choice: ");
            String choice = input.nextLine();

            if(choice.equals("C") || choice.equals("c")) {
                Scanner scan = new Scanner(System.in);
                System.out.print("Please enter the temperature in Fahrenheit: ");
                double Fahrenheit = scan.nextDouble();

                double Celsius = (Fahrenheit-32)*5/9;

                System.out.println("The temperature in celsius is "+Celsius);
            }

            else if (choice.equals("F") || choice.equals("f")) {
                Scanner scan = new Scanner(System.in);
                System.out.print("Please enter the temperature in Celsius: ");
                double Celsius = scan.nextDouble();

                double Fahrenheit = ((9 * Celsius)/5)+32;

                System.out.println("The temperature in Fahrenheit is "+Fahrenheit);
            }
        }
    }