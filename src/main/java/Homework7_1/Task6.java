package Homework7_1;

public class Task6 {
    public static void main(String[] args) {
//        Дан массив:
//        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
//        необходимо вывести максимальное значение массива

        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};

        int max = array[0][0];

        for (int[] rows : array) {
            for (int num : rows) {
                if (num > max) {
                    max = num;
                }
            }
        }

        System.out.println(max);

    }
}
