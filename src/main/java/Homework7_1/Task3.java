package Homework7_1;

public class Task3 {
    public static void main(String[] args) {
//        Дан массив:
//        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//        необходимо вывести минимальное значение массива.


        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};

        int min = array[0];

        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }

        System.out.println(min);



    }
}
