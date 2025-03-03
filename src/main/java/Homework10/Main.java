package Homework10;

public class Main {
    public static void main(String[] args) {

        System.out.println(convertGradeToText(4));
        System.out.println(convertAmericanGradeToText('A'));

    }

    public static String convertGradeToText(int grade) {
        String text = "";
        switch (grade) {
            case 1: text = "плохо"; break;
            case 2: text = "неудовлетворительно"; break;
            case 3: text = "удовлетворительно"; break;
            case 4: text = "хорошо"; break;
            case 5: text = "отлично"; break;
            default: text = "Введите оценку от 1 до 5";

        }

        return text;
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
