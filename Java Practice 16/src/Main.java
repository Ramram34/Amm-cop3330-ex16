/*
 *  UCF COP3330 Fall 2021 Assignment 16 Solution
 *  Copyright 2021 Rami Amm
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("What is your age?");
        int age = in.nextInt();

        if (age > 15){
            System.out.println("You are legally old enough to drive!");
        }

        else{
            System.out.println("You are not legally old enough to drive!");
        }
    }
}
