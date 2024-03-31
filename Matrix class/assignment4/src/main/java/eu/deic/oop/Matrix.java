package eu.deic.oop;

import java.util.Scanner;

public class Matrix {
    private int columns;
    private int rows;
    private int[][] matrix;

    public Matrix(int row, int column) {
        this.rows = row;
        this.columns = column;
        this.matrix = new int[row][column];
    }

    public void setMatrix() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < this.rows; i++) {
            System.out.println("Add a number for\nRow " + (i + 1));
            for (int j = 0; j < this.columns; j++) {
                System.out.println("Column " + (j + 1) + ":");
                String input = scanner.nextLine();
                if (input.isEmpty()) {
                    System.out.println("You didn't add a number!");
                }
                this.matrix[i][j] = Integer.valueOf(input);
            }
        }
        System.out.println("Your matrix is all set!");
    }

    public int[][] getMatrix() {
        return this.matrix;
    }

    public void setElement(int row, int column, int value) {
        if (row < 0 || row >= rows || column < 0 || column >= columns) {
            System.out.println("Invalid row or column index.");
            return;
        }
        this.matrix[row - 1][column - 1] = value;
    }

    public int getElement(int row, int column) {
        if (row < 0 || row >= this.rows || column < 0 || column >= this.columns) {
            System.out.println("Invalid row or column index.");
            return -1;
        }
        return this.matrix[row - 1][column - 1];
    }

    public void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < 2 * columns; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

}
