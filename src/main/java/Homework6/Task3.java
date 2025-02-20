package Homework6;

public class Task3 {
    public static void main(String[] args) {

//        Задача №3
//
//        Дана строка:
//        String s = “Посмотрите как Рите нравится ритм”;
//        необходимо вывести индексы начала всех подстрок - “рит”, независимо от регистра.
//        Для указанной строки ответ будет 6, 15, 29.

        String s = "Посмотрите как Рите нравится ритм";


        int index = s.toLowerCase().indexOf("рит");
        while (index != -1) {
            System.out.println(index);
            index = s.toLowerCase().indexOf("рит", index + 1);
        }


    }
}
