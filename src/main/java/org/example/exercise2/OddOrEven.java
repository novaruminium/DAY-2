package org.example.exercise2;

import java.util.Scanner;

public class oddoreven
{
    public static void  oddoreven()
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Input the number: ");
        int n = scan.nextInt();

        if(n % 2 == 0)
            System.out.println(n + " is even, so it is false.");
        else
            System.out.println(n + " is odd, so it is true.");
    }
}
