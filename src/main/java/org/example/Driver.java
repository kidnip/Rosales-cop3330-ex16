package org.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jeremy Rosales
 */
public class Driver
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        int x;

        System.out.print("What is your age? ");
        x = input.nextInt();
        System.out.println(x >= 16 ? "You are old enough to legally drive." : "You are not old enough to legally drive.");

    }
}
