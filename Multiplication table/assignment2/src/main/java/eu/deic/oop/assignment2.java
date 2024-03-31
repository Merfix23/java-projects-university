package eu.deic.oop;

import java.util.Scanner;

// Write a simple Java program that uses nested for 
// loops to print a multiplication table – nested loops.

public class assignment2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a number for it's multiplication table:");
        System.out.println();

        int input = Integer.valueOf(scanner.nextLine());
        if (input < 1) {
            System.out.println("Invalid number. It must be positive!");
        }

        for (int i = 1; i <= input; i++) {
            System.out.println("");
            for (int j = 1; j <= input; j++) {
                System.out.printf("%4d", i * j);
            }
        }
    }
}
