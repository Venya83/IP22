package from25_05;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private LocalDate hireDate;
    private double salary;
    private LocalDate salaryDate;

    public Employee(String name, LocalDate hireDate, double salary) {
        this.name = name;
        this.hireDate = hireDate;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getSalaryDate() {
        return salaryDate;
    }

    public void setSalaryDate(LocalDate salaryDate) {
        this.salaryDate = salaryDate;
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee("Иван", LocalDate.of(2022, 1, 15), 2000.0);
        Employee employee2 = new Employee("Пётр", LocalDate.of(2021, 6, 10), 2500.0);

        employee1.setSalaryDate(LocalDate.of(2023, 5, 31));
        employee2.setSalaryDate(LocalDate.of(2023, 5, 31));

        FullReport fullReport = new FullReport();
        fullReport.addEmployee(employee1);
        fullReport.addEmployee(employee2);

        fullReport.printReport();
    }
}
