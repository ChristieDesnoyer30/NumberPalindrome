package com.company;

public class Main {

    public static void main(String[] args) {

        int product = 0;

        for(int i = 99; i >=1; i-- ){
            for (int j = 99; j >= 1; j--){

                product = i* j;

                String product1 = Integer.toString(product);

                comparePalindrome(product1);


            }

            break;
        }

        System.out.println("Done");


    }


    public static void comparePalindrome(String number){

        String reverse = isPalindrome(number);

        if(number.equals(reverse)){
            System.out.println( number + " is a palindrome " + reverse);

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
