package from25_05;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

class FullReport {
    private List<Employee> employees;

    public FullReport() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void printReport() {
        LocalDate currentDate = LocalDate.now();

        for (Employee employee : employees) {
            System.out.println("Имя: " + employee.getName());
            System.out.println("Дата приема на работу: " + employee.getHireDate());
            System.out.println("Зарплата: " + employee.getSalary());
            System.out.println("Дата выдачи зарплаты: " + employee.getSalaryDate());

            if (employee.getSalaryDate() == null) {
                System.out.println("Дата выдачи зарплаты не установлена.");
            } else if (currentDate.isAfter(employee.getSalaryDate())) {
                System.out.println("Зарплата уже выдана.");
            } else if (currentDate.isBefore(employee.getSalaryDate())) {
                System.out.println("Зарплата еще не выдана.");
            } else {
                System.out.println("Сегодня день выдачи зарплаты!");
            }

            System.out.println();
        }
    }
}
