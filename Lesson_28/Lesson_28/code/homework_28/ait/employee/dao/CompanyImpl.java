package homework_28.ait.employee.dao;

import homework_28.ait.employee.model.Employee;
import homework_28.ait.employee.model.SalesManager;

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
        double totalSalary = 0;
        for (int i = 0; i < size; i++) {
            totalSalary += employees[i].calcSalary();
        }
        return totalSalary;
    }

    @Override
    public double averageSalary() {
        return totalSalary()/size;
    }

    @Override
    public double totalSales() {
        double totalSales = 0;
        for (int i = 0; i < size; i++) {
            if(employees[i] instanceof SalesManager){ // проверка перед кастингом
                SalesManager sm = (SalesManager) employees[i];
                totalSales += sm.getSalesValue();
            }
        }
        return totalSales;
    }

    @Override
    // count quantity
    public Employee[] findEmployeeHoursGreaterThan(int hours) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if(employees[i].getHours() > hours){ // criteria
                count++;
            }
        }
        Employee[] res = new Employee[count]; // new array for results
        // читаем массив и перекладываем рез-ты в новый
        for (int i = 0, j = 0 ; j < res.length; i++) {
            if(employees[i].getHours() > hours){ // criteria
                res[j++] = employees[i];
            }
        }
        return res;
    }

    // count quantity
    @Override
    public Employee[] findEmployeeSalaryRange(double min, double max) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if(employees[i].calcSalary() > min && employees[i].calcSalary() < max ){ // criteria
                count++;
            }
        }
        Employee[] res = new Employee[count];
        // читаем массив и перекладываем рез-ты в новый
        for (int i = 0, j = 0 ; j < res.length; i++) {
            if(employees[i].calcSalary() > min && employees[i].calcSalary() < max){ // criteria
                res[j++] = employees[i];
            }
        }
        return res;
    }
}
