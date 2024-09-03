package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object

        // Task 1: Convert Fahrenheit to Celsius
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();  // Read user input for Fahrenheit

        double celsius = convertFahrenheitToCelsius(fahrenheit);  // Convert to Celsius
        System.out.printf("Temperature in Celsius: %.2f\n", celsius);

        // Task 2: Convert Centimeters to Kilometers
        System.out.print("Enter distance in centimeters: ");
        double centimeters = scanner.nextDouble();  // Read user input for centimeters

        double kilometers = convertCentimeterToKilometer(centimeters);  // Convert to Kilometers
        System.out.printf("Distance in kilometers: %.5f\n", kilometers);

        scanner.close();  // Close the scanner object
    }

    // Method to convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit)
    {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Method to convert Centimeters to Kilometers
    public static double convertCentimeterToKilometer(double centimeters)
    {
        return centimeters / 100000;
    }
}