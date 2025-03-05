package Homework10;

public class Main {
    public static void main(String[] args) {

        System.out.println(convertGradeToText(4));
        System.out.println(convertAmericanGradeToText('A'));

    }

    public static String convertGradeToText(int grade) {
        switch (grade) {
            case 1: return "плохо";
            case 2: return "неудовлетворительно";
            case 3: return "удовлетворительно";
            case 4: return "хорошо";
            case 5: return "отлично";
            default: return "Введите оценку от 1 до 5";
        }
    }

    public static String convertAmericanGradeToText(char grade) {
        return switch (Character.toUpperCase(grade)) {
            case 'F' -> "неудовлетворительно";
            case 'C' -> "удовлетворительно";
            case 'B' -> "хорошо";
            case 'A' -> "отлично";
            default -> "Введите оценку от F, C, B или A";
        };
    }


}
