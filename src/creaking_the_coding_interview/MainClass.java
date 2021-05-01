package creaking_the_coding_interview;

import creaking_the_coding_interview.arrays_and_string.*;

public class MainClass {
    public static void main(String[] args){

        /*Is Unique: Implement an algorithm to determine if a string has all unique characters. What if you
        cannot use additional data structures?*/
        UnicChar.isStringHasUniqueChar("string");

        /*Check Permutation: Given two strings, write a method to decide if one is a permutation of the
        other.*/
        CheckPermutation.checkPermutation("string01", "string02");

        /*Write a method to replace all spaces in a string with '%20'. You may assume that the string
        has sufficient space at the end to hold the additional characters, and that you are given the "true"
        length of the string. (Note: if implementing in Java, please use a character array so that you can
        perform this operation in place.)*/
        String string="asd asdas sad                     ";
        int length = 13;
        Urlify.urlify(string.toCharArray(), length);

        /*Palindrome Permutation: Given a string, write a function to check if it is a permutation of
        a palindrome. A palindrome is a word or phrase that is the same forwards and backwards. A
        permutation is a rearrangement of letters. The palindrome does not need to be limited to just
        dictionary words.*/
        //problem ee bujhi nai

        /*One Away: There are three types of edits that can be performed on strings: insert a character,
        remove a character, or replace a character. Given two strings, write a function to check if they are
        one edit (or zero edits) away.*/
        String string01= "pale";
        String string02= "ple";
        OneEditAway oneEditAway = new OneEditAway();
        oneEditAway.isOneEditAway(string01, string02);



        /*String Compression: Implement a method to perform basic string compression using the counts
        of repeated characters. For example, the string aabcccccaaa would become a2blc5a3. If the
        "compressed" string would not become smaller than the original string, your method should return
        the original string. You can assume the string has only uppercase and lowercase letters (a - z)*/
        StringCompression stringCompression = new StringCompression();
        stringCompression.compression("aaabbbcccd");

        /*Rotate Matrix: Given an image represented by an NxN matrix, where each pixel in the image is 4
        bytes, write a method to rotate the image by 90 degrees. Can you do this in place?*/
        //problem bujhi nai

        /*Zero Matrix: Write an algorithm such that if an element in an MxN matrix is 0, its entire row and
        column are set to 0.*/
        int[][] matrix ={{0,1,2,3},
                        {1,2,0,4}};
        ZeroMetrix zeroMetrix = new ZeroMetrix();
        zeroMetrix.makeZeroMetrix(matrix);

        /*String Rotation: Assume you have a method i 5Su b 5 tr ing which checks if one word is a substring
        of another. Given two strings, 51 and 52, write code to check if 52 is a rotation of 51 using only one
        call to i5Sub5tring (e.g., "waterbottle" is a rotation of" erbottlewat").*/

        /*If we imagine that 52 is a rotation of 51, then we can ask what the rotation point is. For example, if you
        rotate waterbottle after wat. you get erbottlewat. In a rotation, we cut 51 into two parts, x and y,
        and rearrange them to get 52.*/
        string01="waterbottle";
        string02="erbottlewat";
        StringRotation stringRotation = new StringRotation();
        stringRotation.isStringRotate(string01, string02);

    }
}
