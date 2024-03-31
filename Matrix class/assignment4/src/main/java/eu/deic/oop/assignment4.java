package eu.deic.oop;

/**
 * Develop in Java, Matrix' class and write a program that uses
 * Matrix objects
 *
 */
public class assignment4 {
    public static void main(String[] args) {
        Matrix a = new Matrix(4, 5);
        a.setMatrix();
        a.printMatrix(a.getMatrix());
        a.setElement(2, 3, 23);
        a.printMatrix(a.getMatrix());
    }
}
