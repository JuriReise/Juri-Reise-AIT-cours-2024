package classwork_27.ait.employee.dao;

import classwork_27.ait.employee.model.Employee;

public class CompanyImpl implements Company {

    private Employee[] employees; // element массива employees[0], employees[1]
    private int size;

    // capacity - возможное кол-во сотрудников
    public CompanyImpl(int capacity) {
        this.employees = new Employee[capacity];
        this.size = size;
    }

    @Override
    public boolean addEmployee(Employee employee) {
        // bad cases
        if(employee == null){
            return false;
        }
        if(size == employees.length){
            return false;
        }
        if(findEmployee(employee.getId()) != null) {
            return false;
        }
        // good case
        employees[size] = employee; // put in array
        size++;
        return true;
    }

    @Override
    public Employee removeEmployee(int id) {
        for (int i = 0; i < size; i++) {
            if(employees[i].getId() == id){
                Employee victim = employees[i];
                employees[i] = employees[size - 1]; // на место жертвы ставим (копируем) последний элемент массива
                employees[size - 1] = null; // последний элемент затрем с помощью null
                size--;
                return victim;
            }
        }
        return null;
    }

    @Override
    public Employee findEmployee(int id) {
        for (int i = 0; i < size; i++) {
            if(employees[i].getId() == id){
                return employees[i];
            }
        }
        return null;
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return null;
    }

    @Override
    public int quantity() {
        return size;
    }

    @Override
    public void printEmployee() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }

    @Override
    public double totalSalary() {
        return 0;
    }

    @Override
    public double totalSales() {
        return 0;
    }

    @Override
    public Employee[] findEmployeeHoursGreaterThan(int hours) {
        return new Employee[0];
    }

    @Override
    public Employee[] findEmployeeSalaryRange(double min, double max) {
        return new Employee[0];
    }
}
