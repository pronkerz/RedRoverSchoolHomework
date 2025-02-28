package Homework8;

public class Manager {
//    Необходимо создать класс Manager с полями: имя, возраст, пол, ЗП в день и количество подчиненных.
//    Класс должен иметь метод - getSalary(Month[] monthArray), метод возвращает зарплату за те месяцы
//    которые были переданы в качестве аргумента.
//    К рассчитанной ЗП должно прибавляться по 1% за каждого подчиненного.

    private String name;
    private int age;
    private String sex;
    private double dailySalary;
    private int employees;

    public Manager(String name, int age, String sex, double dailySalary, int employees) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.dailySalary = dailySalary;
        this.employees = employees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public double getDailySalary() {
        return dailySalary;
    }

    public void setDailySalary(double dailySalary) {
        this.dailySalary = dailySalary;
    }

    public int getEmployees() {
        return employees;
    }

    public void setEmployees(int employees) {
        this.employees = employees;
    }

    public double getSalary(Month[] months) {
        double baseSalary = 0;
        for (Month month : months) {
            baseSalary += dailySalary * month.getWorkingDayNumber();
        }

        double bonus = baseSalary * (employees * 0.01);

        return baseSalary + bonus;
    }

}
