package org.example;

public class IfElse {
    private static final String TEXT = "На ноль делить нельзя!!";

    public static void main(String[] args) {
        showDivision(5,2);
        showDivision(0,2);
        showDivision(4,0);
    }
    private static void showDivision(int num1, int num2){
        if (num2 == 0){
            print(TEXT);
        } else  print(num1/num2); ;
    }

    private static void print(int num){
        System.out.println(num);
    }

    private static void print(String text){
        System.out.println(text);
    }
}
