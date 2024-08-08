package org.example;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(checkForPalindrome("I did, did I?"));
        System.out.println(checkForPalindrome("Racecar"));
        System.out.println(checkForPalindrome("hello"));
       System.out.println(checkForPalindrome("Was it a car or a cat I saw ?"));
       System.out.println(checkForPalindrome("Welcome"));
        System.out.println(checkForPalindrome("radar"));



        System.out.println(convertDecimalToBinary(5));
        System.out.println(convertDecimalToBinary(6));
        System.out.println(convertDecimalToBinary(13));


    }

    public static boolean checkForPalindrome(String text){
        String cleanedText= text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        System.out.println(cleanedText);
//        String[] word=cleanedText.split("\\s+");
//        String[] reversed=new String[word.length];
//
//        for(int i=0;i< word.length;i++){
//            reversed[i] =word[word.length-1-i];
//        }
//
//        for (int i=0;i< word.length;i++){
//            if(!word[i].equals(reversed[i])){
//                return false;
//            }
//        }
//        return true;

        String reversedText=new StringBuilder(cleanedText).reverse().toString();
        System.out.println(reversedText);

        return cleanedText.equals(reversedText);

    }

    public static String convertDecimalToBinary(int number){
        StringBuilder binaryNumber=new StringBuilder();
        while(number!=0){
            binaryNumber.insert(0,number%2) ;
            number=number/2;
        }
        return binaryNumber.toString();
    }

}