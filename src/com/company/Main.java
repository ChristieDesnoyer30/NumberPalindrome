package com.company;

import java.util.ArrayList;
import java.util.Arrays;
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

        Collections.sort(palindromeArray);

        Collections.reverse(palindromeArray);

        System.out.println(palindromeArray.get(0));

        System.out.println("Done");


    }


    public static void comparePalindrome(String number){

        int palindrome = 0;

        String reverse = isPalindrome(number);

        if(number.equals(reverse)){

            palindrome = Integer.parseInt(number);



        }

        palindromeArray.add(palindrome);

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
