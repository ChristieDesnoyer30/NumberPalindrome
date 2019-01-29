package com.company;

import java.util.ArrayList;
import java.util.Collections;


public class Main {

    public static void main(String[] args) {

        int product = 0;

        ArrayList<Integer> palindromeArray = new ArrayList<>();


        for(int i = 999; i >100; i--){

            for (int j = 999; j >100; j--){

                product = i* j;

                String product1 = Integer.toString(product);

               int bread=  comparePalindrome(product1);

                //System.out.println(bread);

               palindromeArray.add(bread);

            }

        }
        Collections.sort(palindromeArray);
        Collections.reverse(palindromeArray);

        System.out.println(palindromeArray.get(0));

        System.out.println("Done");


    }


    public static int comparePalindrome(String number){

        int palindrome = 0;

        String reverse = isPalindrome(number);

        if(number.equals(reverse)){

           //System.out.println(number + " is a palindrome " + reverse);


            palindrome = Integer.parseInt(number);

           // System.out.println(palindrome);

        }

        return palindrome;

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
