package eu.deic.oop;

import java.util.Scanner;

public class ConsumeTracker {
    Scanner scanner = new Scanner(System.in);
    private Matrix consumptionMatrix;
    private int days;

    public ConsumeTracker(int days) {
        // I ll create a matrix with 2 rows, one for liters and one for money
        this.consumptionMatrix = new Matrix(2, days);
        this.days = days;
    }

    public void setConsumptionForOneDay(int day, int liters, int pricePerLiter) {
        // Set the gas consumption for a specific day
        this.consumptionMatrix.setElement(0, day, liters);
        this.consumptionMatrix.setElement(1, day, liters * pricePerLiter);
    }

    public void setConsumption() {
        System.out.println("Set your gas consumption here\n(The days start from 0)");
        int i = 0;
        while (i < this.days) {
            System.out.println("Write the day number:");
            String dayString = scanner.nextLine();
            if (dayString.isEmpty() || Integer.valueOf(dayString) < 0) {
                System.out.println("You didn't enter a valid number!");
                break;
            }
            int day = Integer.valueOf(dayString);
            System.out.println("Write the liters consumed that day:");
            int liters = Integer.valueOf(scanner.nextLine());
            System.out.println("Write the price per liter on that day:");
            int pricePerLiter = Integer.valueOf(scanner.nextLine());
            this.consumptionMatrix.setElement(0, day, liters);
            this.consumptionMatrix.setElement(1, day, liters * pricePerLiter);
            i++;
        }
        System.out.println("The consumption was set");
    }

    public double consumptionLiters() {
        int totalLiters = 0;
        for (int day = 0; day < this.days; day++) {
            totalLiters += consumptionMatrix.getElement(0, day);
        }
        return totalLiters;
    }

    public double consumptionMoney() {
        int totalMoney = 0;
        for (int day = 0; day < this.days; day++) {
            totalMoney += consumptionMatrix.getElement(1, day);
        }
        return totalMoney;
    }

    public double averageConsumptionLiters() {
        return consumptionLiters() / days;
    }

    public double averageConsumptionMoney() {
        return consumptionMoney() / days;
    }

    public Matrix getConsumptionMatrix() {
        return this.consumptionMatrix;
    }

}
