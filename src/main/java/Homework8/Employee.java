package Homework8;

public class Employee {
//    Необходимо создать класс Employee с полями: имя, возраст, пол и ЗП в день.
//    Класс должен иметь метод - getSalary(Month[] monthArray),
//    метод возвращает зарплату за те месяцы которые были переданы в качестве аргумента.

    private final String name;
    private final int age;
    private final String sex;
    private final double dailySalary;

    public Employee(String name, int age, String sex, double dailySalary) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.dailySalary = dailySalary;

    }

    public Employee(String name, double dailySalary) {
        this(name, 0, "", dailySalary);
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public double getSalary(Month[] months) {
        double salary = 0;
        for (Month month : months) {
            salary += dailySalary * month.getWorkingDayNumber();
        }

        return salary;
    }

    public Manager convertToManager(int employees) {
        return new Manager(name, age, sex, dailySalary, employees);
    }

    public static void main(String[] args) {
        Employee margo = new Employee("Margo", 100.0);
        System.out.println(margo.getSalary(MonthUtils.SUMMER_MONTHS));
        System.out.println();
        Manager margoManager = margo.convertToManager(10);
        System.out.println(margoManager.getSalary(MonthUtils.SUMMER_MONTHS));


    }

}
