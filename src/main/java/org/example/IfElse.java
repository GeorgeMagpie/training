package org.example;

public class IfElse {
    private static final String TEXT = "На ноль делить нельзя!!";

    public static void main(String[] args) {
        showDivision(5,2);
        showDivision(0,2);
        showDivision(4,0);
        showDivision(0,0);

        drink(false, false);
        drink(false,false);
        drink(true, false);
        drink(true, true);

        System.out.println(" ");

        priceAlcohol(10,4,0);
        priceAlcohol(10,10,20);
        priceAlcohol(12,2,12);
        priceAlcohol(5,2,2);

    }
    private static void showDivision(int num1, int num2){
        if (num2 == 0 && num1 == 0){
            print("Оба числа равны нулу");
        } else if (num2 == 0) {
            print(TEXT);
        } else print(num1 / num2);

    }

    private static void print(int num){
        System.out.println(num);
    }

    private static void print(String text){
        System.out.println(text);
    }

    private static void drink(boolean isTodayFriday, boolean makeMoney){
        if (!isTodayFriday) {
            System.out.println("Гречка на ужин");
        } else if (!makeMoney){
            System.out.println("Отдолжэить денег у друга и пойти с ним пить");
        }else System.out.println("Иду пить в бар один");
    }

    private static void priceAlcohol(int priceBeer, int priceWhiskey, int haveMoney){
        if (haveMoney == 0){
            System.out.println("Грустный и трезвый топаю домой");
        } else if (haveMoney == priceBeer + priceWhiskey){
            System.out.println("Несусь домой в припрыжку и пивом и виски подмышкой!");
        }else if (haveMoney != priceBeer + priceWhiskey ){
            if (haveMoney == priceBeer){
                System.out.println("Иду домой с пивом");
            } else if (haveMoney == priceWhiskey){
                System.out.println("Иду домой с виски");
            }
        }
    }
}
