package Homework7_3;

public class FindSmallestIntegerInArray {
    public static void main(String[] args) {
        int[] array = {3, 70, 6, 2, 9};
        System.out.println(findSmallestInt(array));

    }
    public static int findSmallestInt(int[] args) {
        int smallest = args[0];
        for (int num : args) {
            if (num < smallest) {
                smallest = num;
            }
        }
        return smallest;
    }
}
