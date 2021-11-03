package com.java.assignment9;

import java.util.Scanner;
import java.util.regex.Pattern;
public class RegexPattern {
    public static void main(String[] args) {
        String inputString;
        Scanner keyboard=new Scanner(System.in);
        System.out.println("enter input string:");
        inputString=keyboard.nextLine();
        if(Pattern.matches("^[A-Z].*(.)$", inputString))
        {
            System.out.println("yes! input string begins with capital letter and ends with a period");
        }
        else
        {
            System.out.println("no! input string does not begin with capital letter or ends with a period");
        }
    }
}
