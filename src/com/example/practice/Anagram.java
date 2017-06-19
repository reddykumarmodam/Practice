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
        System.out.println("Enter first string:-");
       String first = input.nextLine();
        System.out.println("Enter second string:-");
       String second = input.nextLine();
       first= first.toLowerCase();
       second= second.toLowerCase();
       if( first.length() == second.length())
       {
           char[] first_char = first.toCharArray();
           char[] second_char = second.toCharArray();
           Arrays.sort(first_char);
           Arrays.sort(second_char);
           String first_sorted = new String(first_char);
           String second_sorted = new String(second_char);
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
