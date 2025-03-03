package Homework8;

public class SalaryUtils {

    public static double getTotalSalary(Employee[] employees, Month[] months) {
        double totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary += employee.getSalary(months);
        }
        return totalSalary;
    }
}
