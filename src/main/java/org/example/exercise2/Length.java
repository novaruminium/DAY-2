package org.example.exercise2;

import java.util.Scanner;

public class Length
{
    public static void  length()
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Input the length in centimeter: ");
        double centimeter = scan.nextDouble();

        double kilometer = centimeter / 100000;
        System.out.println(kilometer + "km");
    }
}
