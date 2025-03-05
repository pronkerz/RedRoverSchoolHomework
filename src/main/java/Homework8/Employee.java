package Homework8;

public class Employee {
    private final String name;
    private int age;
    private String sex;
    private final double dailySalary;

    public Employee(String name, double dailySalary) {
        this.dailySalary = dailySalary;
        this.name = name;
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

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public double getSalary(Month[] months) {
        double salary = 0;
        for (Month month : months) {
            salary += dailySalary * month.getWorkingDayNumber();
        }

        return salary;
    }

    public Manager convertToManager(int employees) {
        return new Manager(name, dailySalary, employees);
    }

    public static void main(String[] args) {
        Employee margo = new Employee("Margo", 100.0);
        Month[] summerMonths = MonthUtils.getMonth("Июнь", "Июль", "Август");
        System.out.println(margo.getSalary(summerMonths));
        System.out.println();

        Manager margoManager = margo.convertToManager(10);
        System.out.println(margoManager.getSalary(summerMonths));

        System.out.println();

        Director annaDirector = new Director("Anna", 100, 10);
        System.out.println(annaDirector.getSalary(summerMonths));

        System.out.println();

        Employee[] employees = new Employee[]{margo, margoManager, annaDirector};
        System.out.println(SalaryUtils.getTotalSalary(employees, summerMonths));


    }

}
