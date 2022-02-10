package com.company;

import java.util.Scanner;

public class ValidNumber {

    static int promptNumberInclusive(int low, int high){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give a number between " + low + " and " + high + " inclusive: ");
        int input = scanner.nextInt();
        while (input < 1 || input > 10){
            System.out.print("You must enter a number between 1 and 10. Please try again: ");
            input = scanner.nextInt();
        }
        return input;
    }


    public static void main(String[] args){
        int number = promptNumberInclusive(1, 10);
        System.out.println(number);
    }
}
