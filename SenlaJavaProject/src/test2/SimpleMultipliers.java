package test2;

import java.util.Scanner;

public class SimpleMultipliers {

    /*Создайте программу, которая будет вычислять и выводить на экран простые множители,
    из которых состоит целое число, введенное пользователем. Если введенное число не целое,
    то нужно сообщать пользователю об ошибке.*/


    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        StringBuilder text = new StringBuilder();
        int myNum = 0;
        int [] multipliers = {2, 3, 5, 7};
        int number = 0;
        try {
            number = sc1.nextInt();
            myNum = number;
        } catch (Exception e) {
            System.out.println("Введено дробное число. Повторите попытку!");
            System.exit(1);
        }
        for (int multiplier : multipliers) {
            while (number % multiplier == 0) {
                number = number / multiplier;
                text.append(multiplier).append("*");
            }

        }
        if ((number - 1) != 0) {
            text.append(number).append("*");
        }
        text.deleteCharAt(text.length() - 1);
        System.out.println("Простые множители, из которых состоит число " + myNum + ": " + text);
    }
}
