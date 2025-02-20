package Homework6;

public class Task4 {
    public static void main(String[] args) {
//        Дан массив:
//        String[][] array = {{“Привет”, “всем”, “кто”}, {“изучает”, “язык”, “программирования”}, {“java”}};
//        необходимо подсчитать количество строк в массиве, которые не содержат буквы “е”.

        String[][] array = {{"Привет", "всем", "кто"}, {"изучает", "язык", "программирования"}, {"java"}};

        int count = 0;
        for (String[] strings : array) {
            for (String string : strings) {
                if (!string.contains("е")) {
                    count++;
                }
            }
        }

        System.out.println(count);




    }
}
