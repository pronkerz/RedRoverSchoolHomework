package Homework8;

public class Manager extends Employee {

    private int employees;

    public Manager(String name, double dailySalary, int employees) {
        super(name, dailySalary);
        this.employees = employees;
    }

    public int getEmployees() {
        return employees;
    }

    public void setEmployees(int employees) {
        this.employees = employees;
    }

    @Override
    public double getSalary(Month[] months) {
        double baseSalary = 0;
        for (Month month : months) {
            baseSalary += super.getDailySalary() * month.getWorkingDayNumber();
        }

        double bonus = baseSalary * (employees * 0.01);

        return baseSalary + bonus;
    }

}
