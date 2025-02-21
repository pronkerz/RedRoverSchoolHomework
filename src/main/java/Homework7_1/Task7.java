package Homework7_1;

public class Task7 {
    public static void main(String[] args) {
//        Дан массив:
//        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
//        необходимо вывести количество элементов в массиве.

        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};

        int amount = 0;

        for (int[] innerArray : array) {
            amount = amount + innerArray.length;
        }

        System.out.println(amount);
    }
}
