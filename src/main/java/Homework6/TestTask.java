package Homework6;

import java.util.Arrays;

public class TestTask {
    public static void main(String[] args) {
//        Напишите метод, который принимает целочисленный массив и возвращает второй по величине элемент.
//        Если в массиве меньше двух уникальных элементов, метод должен выбрасывать исключение IllegalArgumentException.

//        Пример вызова метода:
//        int[] numbers = {10, 20, 4, 45, 99, 99, 45};
//        System.out.println(findSecondLargest(numbers));
//
//        Ожидаемый результат:
//        45

        int[] numbers = {-5, -8, -8};

        System.out.println(findSecondLargest(numbers));

    }

    public static int findSecondLargest(int[] numbers) {
        if(numbers.length < 2){
            throw new IllegalArgumentException("Должно быть минимум два элемента в массиве!");
        }
        Arrays.sort(numbers);
        for (int i = numbers.length - 2; i >= 0; i--) {
            if (numbers[i] != numbers[numbers.length - 1]) {
                return numbers[i];
            }
        }
        throw new IllegalArgumentException("Нет второго по величине элемента!");



    }
}
