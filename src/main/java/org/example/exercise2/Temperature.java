package org.example.exercise2;

import java.util.Scanner;

public class Temperature
{
    public static void temparature()
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Input the temparature in Fahrenheit: ");
        double temparature = scan.nextDouble();

        double celcius = (temparature - 32) * 5 / 9;
        System.out.println(celcius + "C");
    }
}
