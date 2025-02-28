package Homework8;

public class Month {
//    Создать класс Month с полями: имя месяца, количеством дней и количеством рабочих дней.
//    Создать класс MonthUtils который бы хранил подготовленные месяцы или их массивы
//    для использования (объекты класса Month).
    private final String name;
    private final int dayNumber;
    private final int workingDayNumber;

    public Month(String name, int dayNumber, int workingDayNumber) {
        this.name = name;
        this.dayNumber = dayNumber;
        this.workingDayNumber = workingDayNumber;
    }

    public String getName() {
        return name;
    }

    public int getDayNumber() {
        return dayNumber;
    }

    public int getWorkingDayNumber() {
        return workingDayNumber;
    }
}
