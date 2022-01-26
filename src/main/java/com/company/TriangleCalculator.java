package com.company;
import java.util.Scanner;

public class TriangleCalculator {
    /**
     * Asks user for input from command line; asks for 2 numbers that describe a triangle.
     * First number represents the adjacent length.
     * Second number represents the opposite length.
     * The program then computes the hypotenuse and prints the Sine, Cosine, and Tangent
     *   of the triangle to the shell.
     */

    public void getSinCosTan(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Length of adjacent side: ");
        double adjacentLength = scanner.nextDouble();
        System.out.print("Length of opposite side: ");
        double oppositeLength = scanner.nextDouble();
        double hypotenuseLength = Math.sqrt(Math.pow(adjacentLength, 2) + Math.pow(oppositeLength, 2));

        System.out.printf("Sine = %.3f\n", oppositeLength / hypotenuseLength);
        System.out.printf("Cosine = %.3f\n", adjacentLength / hypotenuseLength);
        System.out.printf("Tangent = %.3f\n", oppositeLength / adjacentLength);
    }

    public static void main(String[] args) {
        new TriangleCalculator().getSinCosTan();
    }
}
