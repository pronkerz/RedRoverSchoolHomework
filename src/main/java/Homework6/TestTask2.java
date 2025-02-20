package Homework6;

public class TestTask2 {
    public static void main(String[] args) {

        int[] numbers ={90, 45, 45};

        System.out.println(findSecondLargest(numbers));

    }

    public static int findSecondLargest(int[] numbers) {

        if(numbers.length < 2){
            throw new IllegalArgumentException("Должно быть минимум два элемента в массиве!");
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int number : numbers) {
            if (number > largest) {
                largest = number;
            }
        }
        for (int number : numbers) {
            if (number > secondLargest && number < largest) {
                secondLargest = number;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Нет второго по величине элемента!");
        }

        return secondLargest;
    }
}
