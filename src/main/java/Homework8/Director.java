package Homework8;

public class Director extends Manager {

    public Director(String name, double dailySalary, int employees) {
        super(name, dailySalary, employees);
    }

    @Override
    public double getSalary(Month[] months) {
        double baseSalary = 0;
        for (Month month : months) {
            baseSalary += super.getDailySalary() * month.getWorkingDayNumber();
        }

        double bonus = baseSalary * (super.getEmployees() * 0.03);

        return baseSalary + bonus;
    }
}
