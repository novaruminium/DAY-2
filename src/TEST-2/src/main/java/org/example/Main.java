package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object

        // Task 1: Convert Fahrenheit to Celsius
        System.out.print("Enter temperature in Fahrenheit: ");
        double fah = scanner.nextDouble();  // Read user input for Fahrenheit

        double celsius = Task1.convertFahToCel(fah);  // Convert to Celsius
        System.out.printf("Temperature in Celsius: %.2f\n", celsius);

        // Task 2: Convert Centimeters to Kilometers
        System.out.print("Enter distance in centimeters: ");
        double cm = scanner.nextDouble();  // Read user input for centimeters

        double kilometers = Task2.convertCmToKm(cm);  // Convert to Kilometers
        System.out.printf("Distance in kilometers: %.5f\n", kilometers);

        scanner.close();  // Close the scanner object
    }
}