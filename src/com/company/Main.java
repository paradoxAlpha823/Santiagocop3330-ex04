/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Diego Santiago
 */


package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        Scanner y = new Scanner(System.in);
        Scanner a = new Scanner(System.in);
        Scanner b = new Scanner(System.in);
        System.out.print("Enter a noun: ");
        String s1 = x.nextLine();
        System.out.print("Enter a verb: ");
        String s2 = y.nextLine();
        System.out.print("Enter an adjective: ");
        String s3 = a.nextLine();
        System.out.print("Enter an adverb: ");
        String s4 = b.nextLine();
        System.out.println("Did you just "+s2+" the "+s3+ " " +s1+" "+s4+"? That's hilarious X3.");
    }
}
