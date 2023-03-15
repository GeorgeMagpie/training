package org.example;

public class Glutton {
    private static final String GLUTTON = "Bob";
    public static void main(String[] args) {
        String eat = "мясо";
        bobEat( eat);
        eat = "пицца";
        bobEat( eat);
    }

    private static void bobEat( String str2){
        System.out.println(GLUTTON + " сьел " + str2 + " и он счастлив");
    }
}
