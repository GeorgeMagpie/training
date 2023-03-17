package org.example;

public class Myssivs {
    static int[] numbers = {1,3,4,5,6,3};
    static int[] negativeNumbers = {1,2,3,-2,-5,5,1,-12};

    public static void main(String[] args) {
        if(numbers[1] > numbers[0]){
            System.out.println("Массивы - это просто. По крайней мере двумерные");
        } else System.out.println("Или нет)))");

        sumArray(numbers);

        System.out.println( counterNegativeNumbers(negativeNumbers));
    }


    private static void sumArray(int[] numbers){
        int sum = 0;
        for (int number : numbers) {
            sum = sum + number;
        }
        System.out.println(sum);
    }

    private static int counterNegativeNumbers(int[] numbers){
        int counter = 0;
        for (int number : numbers) {
            if (number < 0) counter++;
        }
        return counter;
    }

}
