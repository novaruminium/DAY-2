package org.example.exercise2;

import java.util.Scanner;

public class Remove
{
    public static void remove()
    {
        Scanner scan = new Scanner(System.in);
        String fullWords = "Hi! my name is Juan, nice to meet you.";
        System.out.println("Hi! my name is Juan, nice to meet you.");

        System.out.println("Remove words: ");
        String words = scan.next();

        if (fullWords.contains(words))
        {
            String newWords = fullWords.replace(words, "");
            System.out.println(newWords);
        }
        else
        {
            System.out.println("Wrong words");
        }
    }
}
