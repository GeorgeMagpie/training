package org.example;

public class BooleanPractice {
    public static void main(String[] args) {
//        String text = "";
//        boolean empty = text.isEmpty();
//        System.out.println(empty);
//        text = "blablabla";
//        empty = text.isEmpty();
//        System.out.println(empty); //Логическая еременная работает логично)))
        String text = "txt";
        print(text);
        text = "";
        print(text);
        text = "control";
        print(text);

        System.out.println(division(4,2));
        System.out.println(division(0, 1));
        System.out.println(division(4,0));
    }
    private static void print(String str){
        if (!str.isEmpty()){
            System.out.println(str);
        }
    }

    private static int division(int num1, int num2){
        if (num2 != 0) {
            return num1 / num2;
        }

        return 911;
    }
}
