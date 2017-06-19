package com.example.practice;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by reddykumarmv on 19.06.17.
 */
public class Anagram {
    static public void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        //Reading input from the console
        System.out.println("Enter first string:-");
       String first = input.nextLine();
        System.out.println("Enter second string:-");
       String second = input.nextLine();
       //Converting the strings to lowercase.
       first= first.toLowerCase();
       second= second.toLowerCase();
       //Anagrams should have equal length
       if( first.length() == second.length())
       {
           //To sort Arrays we need to convert to Char Arrays
           char[] first_char = first.toCharArray();
           char[] second_char = second.toCharArray();
           Arrays.sort(first_char);
           Arrays.sort(second_char);
           String first_sorted = new String(first_char);
           String second_sorted = new String(second_char);
           //Comparing sorted Arrays
           if(first_sorted.equals(second_sorted))
           {
               System.out.println("Strings are Anagrams");
           }
           else
           {
               System.out.println("Strings are Not Anagrams");
           }
       }
       else
       {
           System.out.println("Length should be same for Anagrams");
       }
    }

}
