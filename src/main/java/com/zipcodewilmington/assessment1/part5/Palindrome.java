package com.zipcodewilmington.assessment1.part5;




public class Palindrome {

    public Integer countPalindromes(String input) {
        int palindromeCount = 0;
        int notPalindrome = 0;
        char[] allPossible = null;
        for(int i = 0; i< input.length();i++) {
            for (int j = i + 1; j <= input.length(); j++) {
                allPossible = input.substring(i, j).toCharArray();
            }
            for (int m = 0; m < allPossible.length; m++) {
                if (allPossible.equals(allPossible)){
                    palindromeCount++;
                }else
                    notPalindrome++;
            }

        }
        return palindromeCount;
    }
}
