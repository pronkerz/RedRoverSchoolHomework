package Homework8;

public class Employee {
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

    public static Employee withoutAge(String name, String sex, double dailySalary) {
        return new Employee(name, 0, sex, dailySalary);
    }

    public static Employee withoutSex(String name, int age, double dailySalary) {
        return new Employee(name, age, "", dailySalary);
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

    public double getDailySalary() {
        return dailySalary;
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

        System.out.println();

        Director annaDirector = new Director("Anna", 100, 10);
        System.out.println(annaDirector.getSalary(MonthUtils.SUMMER_MONTHS));

        System.out.println();

        Employee[] employees = new Employee[]{margo, margoManager, annaDirector};
        System.out.println(SalaryUtils.getTotalSalary(employees, MonthUtils.SUMMER_MONTHS));


    }

}
