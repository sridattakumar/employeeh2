// Write your code here
package com.example.employee.repository;

import com.example.employee.model.Employee;
import java.util.*;

public interface EmployeeRepository{
    public ArrayList<Employee> getEmployees();

    public Employee getEmployeeById(int employeeId);

    public Employee addEmployee(Employee employee);

    public Employee updateEmployee(int employeeId, Employee employee);

    public void deleteEmployee(int employeeId);
    
}