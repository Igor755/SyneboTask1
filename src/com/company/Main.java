package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Please enter number of squares (squares must be >= 1 and <= 10 in power 9, and integer)");
        Scanner scan = new Scanner(System.in);


        long n, k;
        double length, width;


        try {
            n = scan.nextInt();


            if (n >= 1 && n <= Math.pow(10,9)) {


                length = Math.floor(Math.sqrt(n));
                width = Math.ceil(n / length);
                k = (long) (2 * n + length + width);
                System.out.print("Number of matches = " + k);


            } else {

                System.out.println("n value not entered correctly");

            }
        } catch (InputMismatchException e) {
            System.out.println("You did not enter an integer");
        }

    }

}


