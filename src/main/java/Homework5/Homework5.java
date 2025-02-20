package Homework5;

public class Homework5 {
    public static void main(String[] args) {
//        Задача №1
//        Дан массив:
//        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//        необходимо вывести все нечетные числа из массива.

        int[] array1 = {9, 2, 6, 4, 5, 12, 7, 8, 6};

        for (int j : array1) {
            if (j % 2 != 0) {
                System.out.println(j);
            }
        }

        System.out.println();


//        Задача №2
//        Дан массив:
//        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//        необходимо вывести все значения массива больше 5.

        int[] array2 = {9, 2, 6, 4, 5, 12, 7, 8, 6};

        for(int j: array2) {
            if(j > 5) {
                System.out.println(j);
            }
        }

        System.out.println();

//        Задача №3
//
//        Дан массив:
//        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//        необходимо увеличить все значения массива на 15.

        int[] array3 = {9, 2, 6, 4, 5, 12, 7, 8, 6};

        for(int j: array3) {
            System.out.println(j*15);
        }


        //Тестовый коммит




    }
}
