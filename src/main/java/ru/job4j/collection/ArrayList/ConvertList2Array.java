package ru.job4j.collection.ArrayList;

import java.util.Arrays;
import java.util.List;

public class ConvertList2Array {
    public static int[][] toArray(List<Integer> list, int cells) {
        int groups = (int) Math.ceil((double) list.size() / cells);
        int[][] array = new int[groups][cells];
        int row = 0, cell = 0;
        for (Integer num : list) {
            array[row][cell] = num;
        }
        return array;
    }

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7);
        System.out.println(list);
        int[][] rsl = toArray(list, 3);
        System.out.println(Arrays.deepToString(rsl));
        for (int[] row : rsl) {
            /*for (int cell : row) {
            }*/
            System.out.println();
        }
    }
}
