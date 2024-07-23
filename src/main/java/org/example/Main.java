package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean isPalindrome(int num) {
        num = Math.abs(num);
        char[] digits = String.valueOf(num).toCharArray();

        int startIndex = 0;
        int endIndex = digits.length - 1;

        for(int i = 0; i < digits.length; i++) {

            if(digits[startIndex] != digits[endIndex]) return false;
            else {
                startIndex++;
                endIndex--;
            }
        }

        return true;
    }

    public static boolean isPerfectNumber(int num) {
        if(num < 0) return false;

        int sum = 0;

        for (int i = 1; i < num; i++) {
            if(num % i == 0) sum += i;
        }

        return sum == num;
    }

    public static String numberToWords(int num) {
        if(num < 0) return "Invalid Value";

        String[] numNames = {
                "Zero",
                "One",
                "Two",
                "Three",
                "Four",
                "Five",
                "Six",
                "Seven",
                "Eight",
                "Nine"
        };

        char[] digits = String.valueOf(num).toCharArray();

        String numsInWords = "";
 
        for (int i = 0; i < digits.length; i++) {
            if(i == digits.length-1) {
                numsInWords += numNames[Integer.parseInt(String.valueOf(digits[i]))];
            } else numsInWords += numNames[Integer.parseInt(String.valueOf(digits[i]))] + " ";
        }

        return numsInWords;

    }
}
