package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

public static ArrayList<Integer> palindromeArray = new ArrayList<>();

    public static void main(String[] args) {

        int product = 0;

        for(int i = 999; i >100; i--){

            for (int j = 999; j >100; j--){

                product = i* j;

                String product1 = Integer.toString(product);

               comparePalindrome(product1);

            }

        }

        
        System.out.println("The highest palindrome product of three digit numbers is : " + Collections.max(palindromeArray));





    }


    public static void comparePalindrome(String number){

        int palindrome = 0;

        String reverse = isPalindrome(number);

        if(number.equals(reverse)){

            palindrome = Integer.parseInt(number);

            palindromeArray.add(palindrome);

        }


    }




    public static String isPalindrome(String number){

        String reverse = "";

        for(int i = number.length() - 1; i >= 0; i--)
        {
            reverse = reverse + number.charAt(i);
        }

        return reverse;


    }






}
