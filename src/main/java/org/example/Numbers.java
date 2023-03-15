package org.example;

public class Numbers {
    public static void main(String[] args) {
        System.out.println(sum(2,2));
        System.out.println(sum(2, 2.2));
        System.out.println(sum(2, 2.3f));
    }

    public static float sum(int num1, float num2){
          return num1 + num2;
    }
    public static int sum(int num1, int num2){
        return  num1 + num2;
    }
    public static double sum(int num1, double num2){
        return  num1 + num2;
    }
}
