package test5;

import java.util.ArrayList;

public class ItemsValue {

    /*Есть набор предметов, задаваемый заранее, предметы могут повторяться. Предмет имеет 2 параметра
            (обязательных, остальные добавлять на усмотрение): объем (целое значение) и ценность (целое значение).
    Предметы неделимы. Также задаётся сейф с обязательным параметром его объёма (целое значение).
    Нужно написать программу, которая наполняет сейф набором предметов таким образом, чтобы ценность этого
    набора была максимальной.*/

    public static void main(String[] args) {
        Item[] items = new Item[5];
        items[0] = new Item(3, 2, "Item1");
        items[1] = new Item(5,5, "Item2");
        items[2] = new Item(4, 3, "Item3");
        items[3] = new Item(9,7, "Item4");
        items[4] = new Item(3,4, "item5");
        Safe mySafe = new Safe(13);
        int[] capacity = new int[items.length];
        for (int i = 0; i < capacity.length; i++) {
            capacity[i] = items[i].getCapacity();
        }
        int[] value = new int[items.length];
        for (int i = 0; i < value.length; i++) {
            value[i] = items[i].getValue();
        }
        String[] itemNames = new String[items.length];
        for (int i = 0; i < itemNames.length; i++) {
            itemNames[i] = items[i].getName();
        }
        int safeVol = mySafe.getVol();
        int itemCount = items.length;

        int[][] optimal = new int[itemCount + 1][];
        for (int i = 0; i < itemCount + 1; i++) {
            optimal[i] = new int[safeVol + 1];
        }

        for (int k = 0; k <= itemCount ; k++) {
            for (int s = 0; s <= safeVol; s++) {
                if (k == 0 || s == 0) {
                    optimal[k][s] = 0;
                } else {
                    if (s >= capacity[k - 1]) {
                        optimal[k][s] = Math.max(optimal[k - 1][s], optimal[k - 1][s - capacity[k - 1]] + value[k - 1]);
                    } else {
                        optimal[k][s] = optimal[k - 1][s];
                    }
                }
            }
            
        }
        ArrayList<String> output = new ArrayList<>();
        trace(optimal, capacity, itemCount, safeVol, output, itemNames);
        System.out.println("Содержимое сейфа: ");
        for (String s : output) {
            System.out.println(s);
        }

    }
    public static void trace (int[][] optimal, int[] capacity, int k, int s, ArrayList<String> output, String[] names) {
        if (optimal[k][s] == 0) {
            return;
        }
        if (optimal[k-1][s] == optimal[k][s]) {
            trace(optimal, capacity, k - 1, s, output, names);
        } else {
            trace(optimal, capacity, k - 1, s - capacity[k - 1], output, names);
            output.add(0, names[k-1]);
        }
    }

}
