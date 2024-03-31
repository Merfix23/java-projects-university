package eu.deic.oop;

/**
 * 1. A person is tracking the gas consume of the his/her car in terms of liters
 * and money invest per litre in every day.
 * Find the overall consume and the average consume in both money and liters.
 * 
 * 2.
 */
public class Main {
    public static void main(String[] args) {

        ConsumeTracker consume = new ConsumeTracker(3);
        consume.setConsumption();
        Matrix consMatrix = consume.getConsumptionMatrix();
        System.out.println("The consumption matrix is the following: ");
        int[][] finala = consMatrix.getMatrix();
        consMatrix.printMatrix(finala);
        System.out.println("Average consumption (liters): " + consume.averageConsumptionLiters());
        System.out.println("Average consumption (money): $" + consume.averageConsumptionMoney());

    }
}
