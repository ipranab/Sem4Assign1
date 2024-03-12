package Test;

import java.util.*;

class Employee<T> {
    private T name;
    private int salary;
    private String status;


    public Employee(T name, int salary) {
        this.name = name;
        this.salary = salary;
        this.status = "Intern";
    }


    public Employee(Employee<T> other) {
        this.name = other.name;
        this.salary = other.salary;
        this.status = other.status;
    }


    public void perm() {
        this.status = "Permanent";
        this.salary *= 2;
    }

    // Getters and Setters
    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // Method to override the toString method
    @Override
    public String toString() {
        return "Employee [name=" + name + ", salary=" + salary + ", status=" + status + "]";
    }
}

class Company {
    List<Employee<?>> employees;
    public Company() {
        this.employees = new ArrayList<Employee<?>>();
    }
    public void addEmployee(Employee<?> employee) {
        this.employees.add(employee);
    }
    public void displayEmployees() {
        for (Employee<?> employee : employees) {
            System.out.println(employee);
        }
    }
}

public class person {
    public static void main(String[] args) {
        Company company = new Company();
        company.addEmployee(new Employee<>("Somu", 2));
        company.addEmployee(new Employee<>("shiv", 3));
        System.out.println("Initial list of employees:");
        company.displayEmployees();
        Employee<?> firstEmployee = company.employees.get(0);
        firstEmployee.perm();
        System.out.println("\nUpdated list of employees:");
        company.displayEmployees();
    }
}