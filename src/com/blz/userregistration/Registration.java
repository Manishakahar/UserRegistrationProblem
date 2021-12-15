package com.blz.userregistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Registration {
    public static void validateLastName(String lastName) {
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(lastName);
        if (matcher.matches()) {
            System.out.println("Last name is valid");
        } else {
            System.out.println("Last name is invalid");
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to User Registration");
        System.out.println("Enter the Last Name :");
        Scanner sc = new Scanner(System.in);
        String lastName = sc.next();
        validateLastName(lastName);

    }
}
