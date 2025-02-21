package Homework7_1;

public class Task4 {
    public static void main(String[] args) {
//        Дан массив:
//        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        необходимо вывести среднее арифметическое всех значений массива.

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int sum = 0;

        for (int num : array) {
            sum += num;
        }

        double average = (double) sum / array.length;

        System.out.println(average);

    }
}
