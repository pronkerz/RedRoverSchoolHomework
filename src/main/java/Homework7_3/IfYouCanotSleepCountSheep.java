package Homework7_3;

public class IfYouCanotSleepCountSheep {
    public static void main(String[] args) {
        System.out.println(countingSheep(3));

    }
    public static String countingSheep(int num) {
        StringBuilder result = new StringBuilder();

        for (int i = 1; i <= num; i++) {
            result.append(i).append(" sheep...");
        }

        return result.toString();
    }
}
