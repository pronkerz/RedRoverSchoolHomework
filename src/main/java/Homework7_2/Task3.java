package Homework7_2;

public class Task3 {
    public static void main(String[] args) {

        for (int i = 0; i <= 9; i++) {
            for(int k = 0; k < i; k++) {
                System.out.print("  ");
            }
            for (int j = 9 - i; j > 0; j--) {
                System.out.print(j + " ");
            }
            for (int k = 0; k <= 9 - i; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}
