package Homework7_3;

public class Task1 {
    public static void main(String[] args) {
//        Необходимо написать 4 метода:
//        сложение 2х чисел
//        вычитание 2х чисел
//        умножение 2х чисел
//        деление 2х чисел

        System.out.println(addition(5,5));
        System.out.println(subtraction(5,5));
        System.out.println(multiplication(5,5));
        System.out.println(division(5,5));

    }
    public static int addition(int a, int b) {
        return a + b;
    }

    public static int subtraction (int a, int b) {
        return a - b;
    }

    public static int multiplication (int a, int b) {
        return a * b;
    }

    public static double division (int a, int b) {
        return (double) a / b;
    }
}
