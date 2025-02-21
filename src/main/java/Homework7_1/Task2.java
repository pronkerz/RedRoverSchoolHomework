package Homework7_1;

public class Task2 {
    public static void main(String[] args) {
//        Дан массив:
//        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//        необходимо вывести максимальное значение массива.

        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};

        int max = array[0];

        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }

        System.out.println(max);
    }
}
