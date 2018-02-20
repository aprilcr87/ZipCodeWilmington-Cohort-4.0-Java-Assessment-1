package com.zipcodewilmington.assessment1.part1;

import com.zipcodewilmington.assessment1.part2.StringUtils;


/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
        return str.substring(0,1).toUpperCase() + str.substring(1);
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        String reversedAndCap = new StringBuilder(str).reverse().toString();
        return reversedAndCap.substring(0,1).toUpperCase() + reversedAndCap.substring(1);
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
        StringBuilder removedFirstAndLAst = new StringBuilder(str).deleteCharAt(0);
        removedFirstAndLAst.deleteCharAt(removedFirstAndLAst.length()-1);
        return removedFirstAndLAst.toString();
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        char[] inverted = str.toCharArray();
        for(int i = 0; i < inverted.length; i++){
            if( Character.isUpperCase(inverted[i])  ){
                inverted[i] = Character.toLowerCase(inverted[i]);
            }else if(Character.isLowerCase(inverted[i])){
                inverted[i] = Character.toUpperCase(inverted[i]);
            }
        }
        str = new String(inverted);
        return str;


    }

}
