package org.example;

import org.example.exercise2.Length;
import org.example.exercise2.Remove;
import org.example.exercise2.Temperature;
import org.example.exercise2.oddoreven

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);


        //Task 1: Fahrenheit to Celcius.
        Temperature.temparature();


        //Task 2: Centimeter to Kilometer.
        Length.length();


        //Task 3: Write a function that takes an integer n as input and returns true if n is odd and false if n is even.
        oddoreven.oddoreven();


        //Task 4: Write a code to remove the ﬁrst occurrence of a given “search string” from a string.
        Remove.remove();

        //Task 5: Write a code to check whether a string is a palindrome or not.
        System.out.println("Type in words: ");
        String words = scan.nextLine();

        if (isPalindrome(words))
        {
            System.out.println("the word is palindrome");
        } c
        else
        {
            System.out.println("the word is not a palindrome");
        }

        public static boolean isPalindrome(String str)
        {
            String cleanedStr = str.replaceAll("\\s+", "").toLowerCase();
            String reversedStr = new StringBuilder(cleanedStr).reverse().toString();
            return cleanedStr.equals(reversedStr);
        }
    }
    }
}