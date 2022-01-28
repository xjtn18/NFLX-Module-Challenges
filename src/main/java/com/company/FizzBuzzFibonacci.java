package com.company;
import java.util.Scanner;

public class FizzBuzzFibonacci {

    public void fizzBuzz(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = s.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = s.nextInt();

        // Print FizzBuzz for each number from 1 to 'num2'
        System.out.print("\nFizzBuzz\n==========\n");
        for (int i = 1; i <= num1; ++i) {
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0){
                System.out.println("Fizz");
            } else if (i % 5 == 0){
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }

        // Print the first 'num2' values of the fibonacci series
        System.out.print("\nFibonacci\n==========\n");
        int fib1 = 0;
        int fib2 = 1;
        System.out.printf("%d %d ", fib1, fib2);
        for (int i = 2; i < num2; ++i){
            int sum_ = fib1 + fib2;
            System.out.printf("%d ", sum_);
            fib1 = fib2;
            fib2 = sum_;
        }
        System.out.print("\n");
    }


    public static void main(String[] args){
        new FizzBuzzFibonacci().fizzBuzz();
    }
}
