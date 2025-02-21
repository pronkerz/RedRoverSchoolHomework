package Homework7_2;

public class Task1 {
    public static void main(String[] args) {
//        Задача №1
//
//        0  1  2  3  4  5  6  7  8  9
//        0  1  2  3  4  5  6  7  8
//        0  1  2  3  4  5  6  7
//        0  1  2  3  4  5  6
//        0  1  2  3  4  5
//        0  1  2  3  4
//        0  1  2  3
//        0  1  2
//        0  1
//        0

        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9 - i; j++) {
                System.out.print(j + "  ");
            }
            System.out.println();
        }

    }
}
