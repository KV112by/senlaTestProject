package test3;

import java.util.Arrays;

import java.util.Scanner;


public class VowelsSort {

    /*Создайте программу, которая будет:
    подсчитывать количество гласных в словах
    выводить слова отсортированным списком по количеству гласных (сначала те, у которых больше гласных)
    делать первую гласную букву в слове заглавной
    Предложение вводится пользователем вручную русскими буквами. Разделитель пробел (“ ”).*/


    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String myText = sc1.nextLine();
        String [] words = myText.split(" ");
        arraySort(words);


    }
    public static void arraySort (String[] z) {
        char[] chars = {'у', 'е', 'ы', 'а', 'о', 'э', 'я', 'и', 'ю', 'ё'};
        for (int i = 0; i < z.length; i++) {
            for (char aChar : chars) {
                if (z[i].charAt(0) == aChar) {
                    z[i] = z[i].replace(z[i].charAt(0), Character.toUpperCase(z[i].charAt(0)));
                }
            }

        }
        Arrays.sort(z, (o1, o2) -> o2.replaceAll("(?i)[йцкнгшщзхъфвпрлджчсмтьб]", "").length()
                - o1.replaceAll("(?i)[йцкнгшщзхъфвпрлджчсмтьб]", "").length());
        System.out.println(Arrays.toString(z));
    }
}
