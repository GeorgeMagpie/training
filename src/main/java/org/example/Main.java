package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!\nЭто не первая программа!");
        int sum = sum(2, 3);
        int diff = diff(2, 1);
        final int multiply = multiply(sum, diff);
        print(multiply);
    }

    private static int sum(int num1, int num2){
        return num1 + num2;
    }
    private static int diff(int num1, int num2){
        return num1 - num2;
    }

    private static int multiply(int num1, int num2){
        return num1 * num2;
    }
    private static void print(int number){
        System.out.println(number);
    }
}