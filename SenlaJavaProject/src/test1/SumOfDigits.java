package test1;

import java.util.Scanner;

public class SumOfDigits {

    /*Напишите программу, которая возвращает сумму цифр,
    присутствующих в данной строке. Если цифр нет, то возвращаемая сумма должна быть равна 0.*/


    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String line = sc1.nextLine();
        int sum = 0;
        if (!line.matches("^\\D*$")) {
            for (int i = 0; i < line.length(); i++) {
                if (Character.isDigit(line.charAt(i))) {
                    sum = sum + Integer.parseInt(String.valueOf(line.charAt(i)));
                }
            }
            System.out.println("Сумма цифр, присутсвующих в данной строке, равна: " + sum);

        } else {
            System.out.println("Цифры в строке отсутствуют! Сумма равна: " + sum);
        }
    }
}
