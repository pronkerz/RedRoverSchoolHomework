package Homework7_2;

public class Task2 {
    public static void main(String[] args) {

        for (int i = 0; i <= 9; i++) {
            for(int k = 0; k < i; k++) {
                System.out.print("  ");
            }
            for(int j = 9 - i; j >= 0 ; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }


    }
}
