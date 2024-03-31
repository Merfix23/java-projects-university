package eu.deic.oop;

import java.util.Scanner;

/*
 Declare one hundred numbers in a Java program, compute their average,
and find out how many numbers are above the average
 */
public class assignment3 {

    public static int[] numberAdd(int[] array, int length) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (i < length) {
            System.out.println("Write numbers untill you reach 100. You have " + (100 - i) + " left");
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                System.out.println("You must write a number, you didn't reach 100.");
                break;
            }
            array[i] = Integer.valueOf(input);
            i++;
        }
        return array;
    }

    public static double average(int[] array, int length) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (double) sum / length;
    }

    public static int aboveAverage(int[] array, double avg) {
        int above = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > avg) {
                above++;
            }
        }
        return above;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = 10;
        int[] array = new int[length];
        array = numberAdd(array, length);
        double avg = average(array, length);
        int above = aboveAverage(array, avg);

        System.out.println("The average of the numbers is: " + avg);
        System.out.println("There are " + above + " numbers above average.");
    }
}
