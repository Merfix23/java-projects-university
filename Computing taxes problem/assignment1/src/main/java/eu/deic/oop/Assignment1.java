package eu.deic.oop;

import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double tax;

        while (true) {
            System.out.println("What's your status? Type a number: (999 to end)");
            System.out.println("1 - Single");
            System.out.println("2 - Married Filling Jointly or Qualified Window(er)");
            System.out.println("3 - Married Filling Separately");
            System.out.println("4 - Head of Household");
            int statusIndex = Integer.valueOf(scanner.nextLine());
            if (statusIndex == 999) {
                break;
            }
            if (statusIndex < 1 || statusIndex > 4) {
                System.out.println("try again");
            }
            int income = 0;
            switch (statusIndex) {
                case 1:
                    System.out.println("Whats your income?");
                    income = Integer.valueOf(scanner.nextLine());
                    if (income < 0) {
                        System.out.println("Invalid income, start again");
                        break;
                    } else if (income <= 8350) {
                        tax = Math.round(income * 0.1 * 100) / 100.00;
                        System.out.println("Your tax is " + tax);
                        break;
                    } else if (income <= 33950) {
                        tax = Math.round(income * 0.15 * 100) / 100.00;
                        System.out.println("Your tax is " + tax);
                        break;
                    } else if (income <= 82250) {
                        tax = Math.round(income * 0.25 * 100) / 100.00;
                        System.out.println("Your tax is " + tax);
                        break;
                    } else if (income <= 171550) {
                        tax = Math.round(income * 0.28 * 100) / 100.00;
                        System.out.println("Your tax is " + tax);
                        break;
                    } else if (income <= 372950) {
                        tax = Math.round(income * 0.33 * 100) / 100.00;
                        System.out.println("Your tax is " + tax);
                        break;
                    } else {
                        tax = Math.round(income * 0.35 * 100) / 100.00;
                        System.out.println("Your tax is " + tax);
                        break;
                    }
                case 2:
                    System.out.println("Whats your income?");
                    income = Integer.valueOf(scanner.nextLine());
                    if (income < 0) {
                        System.out.println("Invalid income, start again!");
                        break;
                    } else if (income < 16700) {
                        tax = Math.round(income * 0.10 * 100) / 100.00;
                        System.out.println("Your tax is " + tax);
                        break;
                    } else if (income <= 67900) {
                        tax = Math.round(income * 0.15 * 100) / 100.00;
                        System.out.println("Your tax is " + tax);
                        break;
                    } else if (income <= 137050) {
                        tax = Math.round(income * 0.25 * 100) / 100.00;
                        System.out.println("Your tax is " + tax);
                        break;
                    } else if (income <= 208850) {
                        tax = Math.round(income * 0.28 * 100) / 100.00;
                        System.out.println("Your tax is " + tax);
                        break;
                    } else if (income <= 137050) {
                        tax = Math.round(income * 0.33 * 100) / 100.00;
                        System.out.println("Your tax is " + tax);
                        break;
                    } else {
                        tax = Math.round(income * 0.35 * 100) / 100.00;
                        System.out.println("Your tax is " + tax);
                        break;
                    }
                case 3:
                    System.out.println("Whats your income?");
                    income = Integer.valueOf(scanner.nextLine());
                    if (income < 0) {
                        System.out.println("Invalid income, start again!");
                        break;
                    } else if (income < 8350) {
                        tax = Math.round(income * 0.1 * 100) / 100.00;
                        System.out.println("Your tax is " + tax);
                        break;
                    } else if (income <= 33950) {
                        tax = Math.round(income * 0.15 * 100) / 100.00;
                        System.out.println("Your tax is " + tax);
                        break;
                    } else if (income <= 68525) {
                        tax = Math.round(income * 0.25 * 100) / 100.00;
                        System.out.println("Your tax is " + tax);
                        break;
                    } else if (income <= 104425) {
                        tax = Math.round(income * 0.28 * 100) / 100.00;
                        System.out.println("Your tax is " + tax);
                        break;
                    } else if (income <= 186475) {
                        tax = Math.round(income * 0.33 * 100) / 100.00;
                        System.out.println("Your tax is " + tax);
                        break;
                    } else {
                        tax = Math.round(income * 0.35 * 100) / 100.00;
                        System.out.println("Your tax is " + tax);
                        break;
                    }
                case 4:
                    System.out.println("Whats your income?");
                    income = Integer.valueOf(scanner.nextLine());
                    if (income < 0) {
                        System.out.println("Invalid income, start again");
                        break;
                    } else if (income < 11900) {
                        tax = Math.round(income * 0.1 * 100) / 100.00;
                        System.out.println("Your tax is " + tax);
                        break;
                    } else if (income <= 45500) {
                        tax = Math.round(income * 0.15 * 100) / 100.00;
                        System.out.println("Your tax is " + tax);
                        break;
                    } else if (income <= 117450) {
                        tax = Math.round(income * 0.25 * 100) / 100.00;
                        System.out.println("Your tax is " + tax);
                        break;
                    } else if (income <= 190200) {
                        tax = Math.round(income * 0.28 * 100) / 100.00;
                        System.out.println("Your tax is " + tax);
                        break;
                    } else if (income <= 372950) {
                        tax = Math.round(income * 0.33 * 100) / 100.00;
                        System.out.println("Your tax is " + tax);
                        break;
                    } else {
                        tax = Math.round(income * 0.35 * 100) / 100.00;
                        System.out.println("Your tax is " + tax);
                        break;
                    }
            }
        }
    }
}
