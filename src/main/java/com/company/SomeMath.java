package com.company;

public class SomeMath {

    static int total5(int num1, int num2, int num3, int num4, int num5){
        return num1 + num2 + num3 + num4 + num5;
    }

    static double average5(int num1, int num2, int num3, int num4, int num5){
        return (num1 + num2 + num3 + num4 + num5) / 5.0;
    }

    static double largest5(double num1, double num2, double num3, double num4, double num5){
        double max = num1;
        max = Math.max(max, num2);
        max = Math.max(max, num3);
        max = Math.max(max, num4);
        max = Math.max(max, num5);
        return max;
    }


    public static void main(String[] args) {
        System.out.println(total5(1,2,3,4,5)); // 15

        System.out.println(average5(1,3,5,7,9)); // 5.0

        System.out.println(largest5(42.0, 35.1, 2.3, 40.2, 15.6)); // 42.0
    }
}
