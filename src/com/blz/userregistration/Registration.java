package com.blz.userregistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Registration {
    public static void validateFirstName(String firstName) {
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(firstName);
        if (matcher.matches()) {
            System.out.println("First name is valid");
        } else {
            System.out.println("First name is invalid");
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to User Registration");
        System.out.println("Enter First Name :");
        Scanner sc = new Scanner(System.in);
        String firstName = sc.next();
        validateFirstName(firstName);

    }
}
