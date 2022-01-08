// java program to reverse a word

import java.io.*;
import java.util.Scanner;

class ReverseString {
    public static void main (String[] args) {

        String str= "Geeks", n="";
        char ch;

        System.out.print("Original word: ");
        System.out.println("Geeks");

        for (int i=0; i<str.length(); i++)
        {
            ch= str.charAt(i); //extracts each character
            n= ch+n; //adds each character in front of the existing string
        }
        System.out.println("Reversed word: "+ n);
    }
}

