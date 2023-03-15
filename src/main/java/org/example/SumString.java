package org.example;

public class SumString {
    public static void main(String[] args) {
        String line1 = "Hello World!!";
        String line2 = "Что-то там написано";
        final String str = stringSum(line1, line2);
        print(str);
    }
    private static String stringSum(String str1, String str2){
        return str1 + "\n" + str2;
    }
    private static void print(String str){
        System.out.println(str);
    }
}
