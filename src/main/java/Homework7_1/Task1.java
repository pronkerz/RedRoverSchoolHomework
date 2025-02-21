package Homework7_1;

public class Task1 {
    public static void main(String[] args) {
//        Дан массив:
//        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//        необходимо вывести сумму всех значений массива.

        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};

        int sum = 0;
        for (int j : array) {
            sum += j;
        }

        System.out.println(sum);

    }
}
