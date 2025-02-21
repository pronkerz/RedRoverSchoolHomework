package Homework7_1;

public class Task5 {
    public static void main(String[] args) {
//        Дан массив:
//        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
//        необходимо вывести сумму элементов массива.

        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};

        int sum = 0;

        for (int[] rows : array) {
            for (int num : rows) {
                sum += num;
            }
        }

        System.out.println(sum);

    }
}
